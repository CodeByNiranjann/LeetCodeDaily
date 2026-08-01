class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int count=0;
        // if(k<=1){
        //     return 0;
        // }
        // for(int i=0;i<nums.length;i++ ){
        //     int product=1;
        //     for(int j=i;j>=0;j--){
        //         product*=nums[j];

        //         if(product<k){
        //             count++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return count;

        if(k<=1) return 0;
        int l=0;
        int count=0;
        int product=1;

        for(int r=0;r<nums.length;r++){
            product*=nums[r];

            while(product>=k){
                product/=nums[l];
                l++;
            }

            count+=r-l+1;
        }
        return count;
    }
}