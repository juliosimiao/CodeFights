int[] firstReverseTry(int[] arr) {
    
    if(arr.length == 0) {
        return arr;
    }
    
    int aux = arr[0];
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = aux;
    
    return arr;
}
