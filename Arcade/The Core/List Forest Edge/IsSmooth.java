boolean isSmooth(int[] arr) {
    
    int size = arr.length;
    int firstElement = arr[0];
    int lastElement = arr[size - 1];   
    int middleElement = 0;
    int middleIndex = 0;    
    
    if(firstElement != lastElement){
        return false;
    }else {
        if(size % 2 == 0){
            middleIndex = size / 2;
            middleElement = arr[middleIndex] + arr[middleIndex - 1];
            if(middleElement != firstElement){
                return false;
            }
        }else{
            middleIndex = (size - 1) / 2;
            middleElement = arr[middleIndex];
            if(middleElement != firstElement){
                return false;
            }
        }
    }
    
    return true;
}
