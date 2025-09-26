class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0){
            int r = Math.max(m,n);
            System.out.print(r);
        }
        int k = 0;
        for(int i = m ; i < nums1.length ; i++){
            nums1[i] = nums2[k++];
        }
        for(int i = 0 ; i < nums1.length - 1; i++){
            for(int j = 0 ; j < nums1.length - i - 1; j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        for(int ele : nums1){
            System.out.print(ele);
        }
    }
}