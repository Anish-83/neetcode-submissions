class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") &&  !tokens[i].equals("/")){
                stack.push(Integer.valueOf(tokens[i]));
            } 
            if(tokens[i].equals("+") ){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1+n2);
                //System.out.println(stack);
            }
            if(tokens[i].equals("-") ){
                int n2=stack.pop();
                int n1=stack.pop();
                stack.push(n1-n2);
                // System.out.println(stack);
            }
            if(tokens[i].equals("*") ){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1*n2);
            }
            if(tokens[i].equals("/") ){
                int n2=stack.pop();
                int n1=stack.pop();
                if(n2!=0)
                    stack.push(n1/n2);
                else
                    stack.push(0);
            }
        }
            
        
        System.out.println(stack);
        return stack.peek();
    }
}
