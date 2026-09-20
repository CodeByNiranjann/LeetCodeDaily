class Solution {
    public int reverseDegree(String s) {
        int rev;
        int ans=0;
        for(int i=0;i<s.length();i++){   
            rev=26-(s.charAt(i)-'a');    //26--26=0,26--26=
            ans+=(i+1)*rev; //0+1*0=1;,
        }
        return ans;

    }
}