class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") &&  !tokens[i].equals("/")){
                stack.push(Integer.valueOf(tokens[i]));
            } 
            else if(tokens[i].equals("+") ){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1+n2);
               
            }
            else if(tokens[i].equals("-") ){
                int n2=stack.pop();
                int n1=stack.pop();
                stack.push(n1-n2);
                
            }
            else if(tokens[i].equals("*") ){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1*n2);
            }
            else if(tokens[i].equals("/") ){
                int n2=stack.pop();
                int n1=stack.pop();
                if(n2!=0)
                    stack.push(n1/n2);
                else
                    stack.push(0);
            }
        }
            
        
        
        return stack.peek();
    }
}
