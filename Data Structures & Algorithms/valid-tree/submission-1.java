class Solution {
    public int find(int indx, int[] parent){
            while(indx!=parent[indx]){
                indx = parent[indx];
            }
            return indx;
        }
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        int[] parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        for(int i=0;i<edges.length;i++){
            int root1 = find(edges[i][0], parent);
            int root2 = find(edges[i][1], parent);
            if(root1!=root2){
                parent[root2] = root1;
            }
            else return false;

        }
        return true;
    }
}
