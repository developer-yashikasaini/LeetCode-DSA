class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0){
            return result;
        }
         List<Integer> firstrow= new ArrayList<>();
         firstrow.add(1);
         result.add(firstrow);
         for(int i=1;i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currow= new ArrayList<>();
            currow.add(1);
            for(int j=1;j<i;j++){
                currow.add(prevRow.get(j-1)+ prevRow.get(j));
            } currow.add(1);
            result.add(currow);

         } return result;
    }
}