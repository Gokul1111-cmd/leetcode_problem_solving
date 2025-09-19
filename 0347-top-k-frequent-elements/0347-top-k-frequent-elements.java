class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num, h.getOrDefault(num,0) + 1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(h.entrySet());
        Collections.sort(l, (a,b) -> b.getValue() - a.getValue());

        int[] arr = new int[k];
        for(int i = 0 ; i < k ; i++){
            arr[i] = l.get(i).getKey();
        }
        return arr;
    }
}