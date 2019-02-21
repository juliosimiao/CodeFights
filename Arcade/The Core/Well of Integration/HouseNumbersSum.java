int houseNumbersSum(int[] inputArray) {
    
    int sum = 0;
    
    for(int i=0;i<inputArray.length;i++){
        if(inputArray[i] != 0){
            sum += inputArray[i];
        }else {
            break;
        }
    }
    
    return sum;
}