boolean sudoku(int[][] grid) {    
    
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[1].length;j++){       
                
            boolean line = checkOnTheLine(i,j,grid);
            if(line == true){
                boolean collumn = checkOnTheCollumn(i,j,grid); 
                if(collumn == true){
                    boolean square = findTheSquare(i,j,grid);
                    if(square == false){
                        return false;
                    }
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
    }
    
    return true;
}

boolean findTheSquare(int line, int collumn, int[][] grid){

    int startCollumn = -1;
    int endCollumn = -1;
    int startLine = -1;
    int endLine = -1;
    
    if(collumn >= 0 && collumn <= 2){ 
        startCollumn = 0;
        endCollumn = 2;
    }
    else if(collumn >= 3 && collumn <= 5){
        startCollumn = 3;
        endCollumn = 5;
    }
    else {
        startCollumn = 6;
        endCollumn = 8;
    }

    if(line >= 0 && line <= 2){
        startLine = 0;
        endLine = 2;
    }
    else if(line >= 3 && line <= 5){
        startLine = 3;
        endLine = 5;
    }
    else {
        startLine = 6;
        endLine = 8;
    }

    return checkOnTheSameSqueare(startLine,endLine,startCollumn,endCollumn,grid,line,collumn);
}

boolean checkOnTheLine(int line, int collumn, int[][] grid){
    
    int value = grid[line][collumn];
    
    for(int j=0;j<grid[1].length;j++){      
        if(j != collumn){
            if(grid[line][j] == value){
                return false;
            }    
        }        
        
    }    
    return true;
}

boolean checkOnTheCollumn(int line, int collumn, int[][] grid){
    
    int value = grid[line][collumn];
    
    for(int j=0;j<grid.length;j++){      
        if(j != line){
            if(grid[j][collumn] == value){
                return false;
            }    
        }        
        
    } 
    
    return true;
}

boolean checkOnTheSameSqueare(int startLine, int endLine, int startCollumn, int endCollumn,          int[][] grid, int line, int collumn){
    
    int value = grid[line][collumn];
    int count = 0;

    for(int i=startLine;i<=endLine;i++){
        for(int j=startCollumn;j<=endCollumn;j++){
            if(grid[i][j] == value){
                count++;
            }
        }
    }

    if(count > 1){
        return false;
    }
    
    return true;    
}