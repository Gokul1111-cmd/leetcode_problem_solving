class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            if(i > 0){
                List<Integer> prevRow = triangle.get(i - 1);
                for(int j = 1 ; j < prevRow.size()  ; j++){
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    currRow.add(sum);
                }
                currRow.add(1);
            }
            triangle.add(currRow);
        }
        return triangle.get(rowIndex);
    }
}