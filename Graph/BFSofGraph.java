GFG : BFS of graph.

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!isVisited[curr]){
                isVisited[curr] = true;
                list.add(curr);
                for(int ne : adj.get(curr)){
                    q.add(ne);
                }
            }
        }
        
        return list;
    }
}
