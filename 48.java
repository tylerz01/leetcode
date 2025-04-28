class Solution {
    public void rotate(int[][] matrix) {
        //{1, 2, 3} -> {7, 4, 1}
        //{4, 5, 6} -> {8, 5, 2}
        //{7, 8, 9} -> {9, 6, 3}
        //--------------------------
        //{ 00, 01, 02} -> {31, 10, 00}
        //{10, 11, 12} -> { 32, 11, 01}
        //{31, 32, 33} -> {33, 12, 02}
        //--------------------------

        //tranpose this matrix
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse this matrix to achieve rotation;
        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        //{5, 1, 9, 11} -> {15, 13, 2, 5}
        //{2, 4, 8, 10} -> {14, 3, 4, 1}
        //{13, 3, 6, 7} -> {12, 6, 8, 9}
        //{15, 14, 12, 16} -> {16, 7, 10, 11}
    }

}