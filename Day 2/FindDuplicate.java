class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[j+1]){
                return nums[j];
            }
        }
return 0;
    }
}