class 3Sum{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
            int l = i+1 , h = nums.length-1 , sum = -nums[i];
            while(l<h){
                if(nums[l]+nums[h]==sum){
                    al.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    while(l<h && nums[l]==nums[l+1])l++;
                    while(l<h && nums[h]==nums[h-1])h--;
                    
                    l++;h--;
                }
                else if(nums[l]+nums[h]<sum)l++;
                else{
                    h--;
                }
            }
            }
        }
        return al;
    }
}
