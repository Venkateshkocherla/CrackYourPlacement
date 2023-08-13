class findDuplicates{
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer> al =new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()==2){
                al.add(entry.getKey());
            }
        }
        return al;
    }
}