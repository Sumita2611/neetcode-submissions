class Solution {
    public void dfs(int node ,List<List<Integer>> adj, boolean[] vis){
        vis[node] = true;
        for(int neigh : adj.get(node)){
            if(!vis[neigh]){
                dfs(neigh , adj , vis);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i  = 0;i < n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i , adj , vis);
            }
        }
        return cnt;
    }
}
