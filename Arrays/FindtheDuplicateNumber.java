class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int ele=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                ele=nums[i];
                break;
            }
        }
        return ele;
        
    }
}