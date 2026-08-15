class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i:asteroids){
            if(i>0){
                stack.push(i);
            }else {
                boolean flag=true;
                while(!stack.isEmpty() && stack.peek()>0){
                    int x=stack.peek();

                    if(x<Math.abs(i)){
                        stack.pop();
                    }else if(x==Math.abs(i)){
                        stack.pop();
                        flag=false;
                        break;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    stack.push(i);
                }

            }
            
        }
        int len=stack.size();
            int ans[]=new int[len];
            int in=0;
            for(int val:stack){
                ans[in]=val;
                in=in+1;
            }
        return ans;
    }
}