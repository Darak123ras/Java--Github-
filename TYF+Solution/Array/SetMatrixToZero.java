// https://leetcode.com/problems/set-matrix-zeroes/description/

public class SetMatrixToZero {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        boolean[] rows=new boolean[n];
        boolean[] cols=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            int j=0;
            if(rows[i]==true){
                while(j<m){
                    matrix[i][j]=0;
                    j++;
                }
            }
        }
        for(int j=0;j<m;j++){
            int i=0;
            if(cols[j]==true){
                while(i<n){
                    matrix[i][j]=0;
                    i++;
                }
            }
        }
    }
}
