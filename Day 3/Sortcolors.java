class Sortcolors{
    public void sortColors(int[] nums) {
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else if(nums[i]==2){
                count3++;
            }
    }
    for(int i=0;i<count1;i++) nums[i]=0;
    for(int j=count1;j<count1+count2;j++) nums[j]=1;
    for(int k=count1+count2;k<count1+count2+count3;k++) nums[k]=2;
}
}