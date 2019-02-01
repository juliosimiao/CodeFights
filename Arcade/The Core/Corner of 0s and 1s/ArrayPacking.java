int arrayPacking(int[] a) {
    String binaryNumber;
    String finalNumber = "";
    
    for(int i=0;i<a.length;i++){
        binaryNumber = String.format("%8s", 
            Integer.toBinaryString(a[i])).replaceAll(" ", "0");
        finalNumber = binaryNumber + finalNumber;
    }
    
    return Integer.parseInt(finalNumber,2);
}
