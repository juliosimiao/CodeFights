char[][] drawRectangle(char[][] canvas, int[] rectangle) {

    int x1 = rectangle[0];
    int y1 = rectangle[1];
    int y2 = rectangle[2];
    int x2 = rectangle[3];

    canvas = writeLeftSide(canvas,y1,x2,x1);
    canvas = writeRightSide(canvas,y1,x2,y2);
    canvas = writeTop(canvas, x1, y2, y1);
    canvas = writeBottom(canvas, x1, y2, x2);

    canvas[y1][x1] = '*';
    canvas[x2][y2] = '*';

    return canvas;
}
char[][] writeTop(char[][] canvas, int x, int y, int line){
    int lastCorner = 0;
    for(int j=x;j<y;j++){
        canvas[line][j] = '-';
        lastCorner = j;
    }
    canvas[line][lastCorner + 1] = '*'; 
    return canvas;
}
char[][] writeBottom(char[][] canvas, int x, int y, int line){
    canvas[line][x] = '*';
    for(int j=x+1;j<=y;j++){
        canvas[line][j] = '-';
    }
    return canvas;
}

char[][] writeLeftSide(char[][] canvas, int x, int y, int collumn) {
    for(int j=x;j<=y;j++){
        canvas[j][collumn] = '|';
    }
    return canvas;
}

char[][] writeRightSide(char [][] canvas, int x, int y, int collumn){
    for(int j=x;j<=y;j++){
        canvas[j][collumn] = '|';
    }
    return canvas;
}