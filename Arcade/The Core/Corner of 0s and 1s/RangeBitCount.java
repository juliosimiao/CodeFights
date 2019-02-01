int rangeBitCount(int a, int b) {
    String finalNumber = "";
    
    for(int i=a;i<=b;i++){
        finalNumber = finalNumber + Integer.toBinaryString(i);
    }
    
    return (int) finalNumber.chars().filter(ch -> ch == '1').count();  
}
