int circleOfNumbers(int n, int firstNumber) {
    int result;
    int diff;
    
    result = (n/2) + firstNumber;
    
    if(result > (n - 1)){
        diff = result - n;
        return diff;
    }
        
    return result;
}
