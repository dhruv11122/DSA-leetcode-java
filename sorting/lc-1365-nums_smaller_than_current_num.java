class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                j=i;
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2 &&i!=j){
                max2=nums[i];
            }
            
        }
        return (max-1)*(max2-1);
    }
}