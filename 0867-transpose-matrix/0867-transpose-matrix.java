class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new int[0][0];
        }
        int totalrow=matrix.length;
        int totalcol=matrix[0].length;
        int newrow=totalcol;
        int newcol=totalrow;
        int [][] ans= new int[newrow][newcol];

        for(int i=0;i<totalrow;i++){
            for(int j=0;j<totalcol;j++){
                 ans[j][i]=matrix[i][j];
            }
        } 
        return ans;

    }
}