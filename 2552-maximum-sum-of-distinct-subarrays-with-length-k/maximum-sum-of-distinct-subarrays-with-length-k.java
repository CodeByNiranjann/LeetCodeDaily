class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long currsum=0;
        int left=0;
        HashSet<Integer> set=new HashSet<>();
        for(int rigth=0;rigth<nums.length;rigth++){
                while(set.contains(nums[rigth])){
                    set.remove(nums[left]);
                    currsum-=nums[left];
                    left++;
                }
                set.add(nums[rigth]);
                currsum+=nums[rigth];

                if(rigth-left+1==k){
                    max=Math.max(max,currsum);
                    set.remove(nums[left]);
                    currsum-=nums[left];
                    left++;
                }
        }
        return max;

    }
}