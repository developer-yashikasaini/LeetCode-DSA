class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){ return true;}
        int start=0;
        int last= s.length()-1;
        while(start<=last){
            char curfirst = s.charAt(start);
            char curlast= s.charAt(last);
            if(!Character.isLetterOrDigit(curfirst)){
                start++;
            }  else if(!Character.isLetterOrDigit(curlast))  {
                last--;
            }  else{
                if(Character.toLowerCase(curfirst)!= Character.toLowerCase(curlast)){ return false;}
                start++;
                last--;
            } 
             } return true;
    }
}