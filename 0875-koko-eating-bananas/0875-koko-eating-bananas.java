class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high= Arrays.stream(piles).max().getAsInt();
        int ans =high;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(canfinish(piles,h,mid)){
                ans=mid;
                high=mid-1;
            } else{ low=mid+1;}
        } return ans;
    }
    public boolean canfinish(int[] piles, int h, int k){
        long hrs=0;
        for(int pile: piles){
            hrs+=pile/k;
            if(pile%k!=0) hrs++;
        } return hrs<=h;
    } }
    