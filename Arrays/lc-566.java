class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int i,j,counter=0;
        int[] lin = new int[mat.length*mat[0].length];
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        else{
           for(i=0;i<mat.length;i++){
               for(j=0;j<mat[0].length;j++){
                   lin[counter++]=mat[i][j];
               }
           }
           counter=0;
           for(i=0;i<r;i++){
               for(j=0;j<c;j++){
                   arr[i][j]=lin[counter++];
               }
           } 
           return arr; 
        }
        
    }
}