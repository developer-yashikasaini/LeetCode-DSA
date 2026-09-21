class Solution {
    public boolean isPalindrome(int x) {
        int reverseno=0;
        int temp=x;
        while(temp>0){
            int remainder=temp%10;
            reverseno= reverseno*10+remainder;
            temp=temp/10;
        } if (x==reverseno){
            return true;
        } else{return false;}
    }
}