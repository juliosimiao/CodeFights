int[] extractMatrixColumn(int[][] matrix, int column) {
    
    int[] result = new int[matrix.length];
    int resultPos = 0;
    
    if(matrix.length == 1){
        result[0] = 0;
        return result;
    }
    
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[1].length;j++){
            if(j == column){
                result[resultPos] = matrix[i][j];
                resultPos++;
            }
        }
    }  
    
    return result;
}