class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n;i++){
            sumodd+=i*2-1;
            sumeven+=i*2;
        }
        while(sumeven!=0){
            int temp=sumeven;
            sumeven=sumodd%sumeven;
            sumodd=temp;
        }
        return sumodd;
    }
}