class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum = 0, digitsum = 0, rem =0;
        for(int i=0 ; i<nums.length; i++)
        {
            elesum += nums[i];
            if(nums[i]<10)
            {
                digitsum += nums[i];
            }
            else
            {
                while(nums[i]!=0){
                  rem = nums[i]%10;
                  digitsum += rem;
                  nums[i] /=10;
                }  
            }
        }
        return Math.abs(elesum - digitsum);
        
    }
}
