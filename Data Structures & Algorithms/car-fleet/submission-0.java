class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       Stack<Double> stack = new Stack<>();
       TreeMap<Integer,Integer> map= new TreeMap<>(Collections.reverseOrder());
       for(int i=0;i<speed.length;i++){
        map.put(position[i],speed[i]);
       }
 
        for(Integer key:map.keySet()){
            stack.push((double)(target-key)/map.get(key));   
            if(stack.size()>=2 && stack.peek()<=stack.get(stack.size()-2)){
                stack.pop();
            }
        }

       return stack.size(); 

    }
}

