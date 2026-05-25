class Solution {
    public int[][] kClosest(int[][] points, int k) {
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        for(int[] arr: points){
            int x=arr[0];
            int y=arr[1];
            int d= (x*x) + (y*y);
            map.putIfAbsent(d, new ArrayList<>());
            map.get(d).add(arr);
        }

        int[][] res = new int[k][2];
        int index = 0;
        
        // Iterate through the sorted map and fill the result array
        for (int distance : map.keySet()) {
            for (int[] point : map.get(distance)) {
                res[index++] = point;
                // Once we have k points, we are done
                if (index == k) {
                    return res;
                }
            }
        }
        
        return res;
        

    }
}
