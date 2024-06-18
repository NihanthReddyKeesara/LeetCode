class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,k=1,temp;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==0 && nums[k]!=0){
                temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
                k++;
            }else if(nums[i]==0 && nums[k]==0){
                k++;
            }
            else{
                i++;
                k++;
            }
        }
    }
}