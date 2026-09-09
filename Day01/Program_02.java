/*1480. Running Sum of 1d Array*/
class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==1){
                
            }
            else if(i<(nums.length-1)){
                arr[i]=sum;
                sum=sum+arr[i+1];

            

        }
        
    }
}
