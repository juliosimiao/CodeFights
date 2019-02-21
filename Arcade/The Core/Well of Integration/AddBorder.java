String[] addBorder(String[] picture) {
    
    String[] array = new String[picture.length + 2];
    int size = picture[0].length() + 2;
    String border = "";
    
    for(int i=0;i<size;i++){
        border += "*";
    }
    
    array[0] = border;
    array[array.length - 1] = border;
    
    for(int j=1;j<array.length - 1;j++){
        array[j] = "*" + picture[j-1] + "*";
    }
    
    return array;
}