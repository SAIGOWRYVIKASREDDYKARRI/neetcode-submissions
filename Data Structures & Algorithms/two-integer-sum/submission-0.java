class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        int[] res=new int[2];
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(flag==0&&hm.containsKey(target-nums[i]))
            {
                res[0]=hm.get(target-nums[i]);
                res[1]=i;
                flag=1;
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}
