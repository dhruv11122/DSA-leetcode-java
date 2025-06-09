class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i;
        int arr[]= new int[2];
        int found=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                found=1;
                break;
            }

        }
        
        for(i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                arr[1]=i;
                break;
            }
        }
        if(found==0){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
        
    }
}