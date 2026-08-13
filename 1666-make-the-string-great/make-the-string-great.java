class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        for(char i:s.toCharArray()){
            if(stack.isEmpty() || Math.abs(stack.peek()-i)!=32){
                stack.push(i);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(char i:stack){
            ans.append(i);
        }
        return ans.toString();

    }
}