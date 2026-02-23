GFG : DFS of Graph

class Solution {
    
    static boolean isVisited[];
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        isVisited = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        sol(adj, 0, list);
        return list;
    }
    
    public static void sol(ArrayList<ArrayList<Integer>> adj, int n, ArrayList<Integer> list){
        
        if(isVisited[n]) return;
        isVisited[n] = true;
        list.add(n);
        for(int i : adj.get(n)){
            sol(adj, i, list);
        }
    }
}
