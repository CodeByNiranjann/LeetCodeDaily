class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int curr=0;
        int ans=0;
        for(int r:requests){
            ans+=Math.abs(curr - r);
            curr=r;
        }
        return ans;
    }
}