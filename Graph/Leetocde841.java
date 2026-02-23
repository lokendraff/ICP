Leetcode 841 : Keys and Rooms

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        int n = rooms.size();
        boolean isVisited[] = new boolean[n];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!isVisited[curr]){
                isVisited[curr] = true;
                for(int ne : rooms.get(curr)){
                    q.add(ne);
                }
            }
        }

        for(boolean f : isVisited){
            if(!f) return false;
        }

        return true;
    }
}
