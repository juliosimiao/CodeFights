int crossingSum(int[][] matrix, int a, int b) {
    return sumLine(matrix, a) + sumCollumn(matrix, b) - matrix[a][b];
}

int sumLine(int[][] matrix, int line){
    int sum = 0;
    for(int i=0;i<matrix[0].length;i++){
        sum += matrix[line][i];
    }
    return sum;
}

int sumCollumn(int [][] matrix, int collumn){
    int sum = 0;
    for(int i=0;i<matrix.length;i++){
        sum += matrix[i][collumn];
    }
    return sum;
}
