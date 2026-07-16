class Solution {
    public int gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int prefix[]=new int[nums.length];
        int mx=nums[0];
        for(int i=0;i<nums.length;i++){
            if(mx<nums[i]){
                mx=nums[i];
            }
            prefix[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefix);
        int left=0;
        int right=nums.length-1;
        long sum=0;
        while(left<right){
            sum+=gcd(prefix[left],prefix[right]);
            left++;
            right--;
        }
        return sum;
    }
}