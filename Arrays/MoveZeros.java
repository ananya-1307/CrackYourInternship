class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int c=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            else 
            {
                j=nums[i];
                nums[k++]=j;
            }
        }
        for(int i=1;i<=c;i++)
            {
            nums[k++]=0;
               
                
            }
        
    }
}