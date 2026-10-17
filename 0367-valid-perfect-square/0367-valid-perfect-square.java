class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
        while(left<=right){
            int mid=(left+right)/2;
            long midsq=(long) mid*mid;
            if(midsq==num) return true;
            else if(midsq>num) right=mid-1;
            else{left=mid+1;}
        } return false;
    }
}