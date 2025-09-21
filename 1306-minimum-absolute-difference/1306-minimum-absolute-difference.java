class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> d = new ArrayList<>();
        int min = 999999999;
        for(int i = 1; i < arr.length ; i++){
            int curr = arr[i] - arr[i-1];
            if(curr < min){
                min = curr;
                d.clear();
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                d.add(pair);
            }
            else if(curr == min){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                d.add(pair);
            }
        }   
        return d;
    }
}