class Solution {
    class Data{
        char val;
        int count;
        Data(char val,int count){
            this.val=val;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Data> stack=new Stack<>();
        for(char i:s.toCharArray()){
            if(stack.isEmpty() || stack.peek().val!=i){
                stack.push(new Data(i,1));
            }else{
                Data cur=stack.peek();
                cur.count+=1;

                if(cur.count==k) stack.pop();
            }
        }
        StringBuilder ans= new StringBuilder();
        for(Data d:stack){
            ans.append((d.val+"").repeat(d.count));
        }
        return ans.toString();
    }
}