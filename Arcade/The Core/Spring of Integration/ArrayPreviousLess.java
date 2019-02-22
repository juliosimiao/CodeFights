int[] arrayPreviousLess(int[] items) {
    
    int[] result = new int[items.length];
    result[0] = -1;
    
    if(items.length == 1){
        return result;
    }
    
    for(int i=1;i<items.length;i++){
        int j = i - 1;
        int min = Integer.MAX_VALUE;
        while(j >= 0){
            if(items[j] < min && items[j] < items[i]){
                min = items[j];
                break;
            }
            j--;
        }
        if(min < items[i]){
            result[i] = min;
        }else {
            result[i] = -1;
        }
    }
    
    return result;
}
