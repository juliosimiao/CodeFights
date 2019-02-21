String integerToStringOfFixedWidth(int number, int width) {
    
    StringBuilder stringBuilder = new StringBuilder(number + "");
    int size = stringBuilder.length();
    
    if(stringBuilder.length() == width){
        return stringBuilder.toString();
    }
    
    if(width > size){
        char[] zeros = new char[width - size];
        for(int i=0;i<zeros.length;i++){
            zeros[i] = '0';
        }
        stringBuilder.reverse();
        stringBuilder.append(zeros);
        return stringBuilder.reverse().toString();        
    }
    
    
    return stringBuilder.delete(0,size - width).toString();
}
