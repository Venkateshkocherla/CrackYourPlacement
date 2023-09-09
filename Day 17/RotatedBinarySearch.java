class RotatedBinarySearch{
    public int search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
    }
    public int BinarySearch(int[]nums,int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(target==nums[mid]){
            return mid;
        }
        if(nums[s]<=nums[mid]){
            if(target>=nums[s] && target<=nums[mid]){
                return BinarySearch(nums,target,s,mid-1);
            }
            else{
                return BinarySearch(nums,target,mid+1,e);
            }
        }
        if(target>=nums[mid] && target<=nums[e]){
            return BinarySearch(nums,target,mid+1,e);
        }
            return BinarySearch(nums,target,s,mid-1);
    }
}