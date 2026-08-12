class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack =new Stack<>();

        for(char i:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=i){
                stack.push(i);
            }else{
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