int[] concatenateArrays(int[] a, int[] b) {
    int[] newArray = new int[a.length + b.length];
    
    for(int i=0;i<b.length;i++){
        newArray[a.length + i] = b[i];
    }
    
    for(int j=0;j<a.length;j++){
        newArray[j] = a[j];
    }
    
    return newArray;
}
