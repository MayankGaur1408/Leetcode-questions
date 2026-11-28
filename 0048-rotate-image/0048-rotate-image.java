class Solution {
    public void rotate(int[][] matrix) {
        //transpose matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse all rows
        for(int i=0;i<matrix.length;i++){
            int startcol=0;
            int endcol=matrix[0].length-1;

            while(startcol<=endcol){
                //swap
                int temp=matrix[i][startcol];
                matrix[i][startcol]=matrix[i][endcol];
                matrix[i][endcol]=temp;

                startcol++;
                endcol--;
            }
        }
        
    }
}