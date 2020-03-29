boolean sudoku2(char[][] grid) {

    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
            if(grid[i][j] != '.'){
                if(checkLine(grid,i,j,grid[i][j]) == true){
                    if(checkCollumn(grid,i,j,grid[i][j]) == true){
                        if(checkBox(grid,i,j,grid[i][j]) == false){
                            return false;
                        }
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
    }

    return true;
}

boolean checkCollumn(char[][] grid, int line, int collumn, char value){
    for(int i=0;i<grid.length;i++){
        if(i != line){
            if(grid[i][collumn] == value){
                return false;
            }
        }
        
    }
    return true;
}

boolean checkLine(char[][] grid, int line, int collumn, char value){
    for(int i=0;i<grid.length;i++){
        if(i != collumn){
            if(grid[line][i] == value){
                return false;
            }
        }
    }
    return true;
}

boolean checkBox(char[][] grid, int line, int collumn, char value){
    int[] lineStartEnd = getStartEnd(line);
    int[] collumnStartEnd = getStartEnd(collumn);
    int valueCont = 0;

    for(int i=lineStartEnd[0];i<=lineStartEnd[1];i++){
        for(int j=collumnStartEnd[0];j<=collumnStartEnd[1];j++){
            if(grid[i][j] != '.'){
                if(grid[i][j] == value){
                    valueCont++;
                }
            }
        }
    }

    if(valueCont > 1){
        return false;
    }
    
    return true;
}
int[] getStartEnd(int index){
    int[] startEnd = new int[2];
    int x1 = -1;
    int x2 = -1;
        
    if(index >= 0 && index <= 2){
        x1 = 0;
        x2 = 2;
    }else if(index >= 3 && index <= 5){
        x1 = 3;
        x2 = 5;
    }else {
        x1 = 6;
        x2 = 8;
    }

    startEnd[0] = x1;
    startEnd[1] = x2;

    return startEnd;
}