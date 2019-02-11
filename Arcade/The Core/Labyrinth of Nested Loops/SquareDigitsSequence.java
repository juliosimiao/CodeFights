int squareDigitsSequence(int a0) {
    
    if(a0 == 1){
        return 2;
    }
    
    int n = a0;
    int count = 1;
    int numberOfNumber1 = 0;
    
    do{
        count++;
        String number = (n + "");
        int numberOfDigits = number.length();
        int sum = 0;
        for(int i=0;i<numberOfDigits;i++){
            sum += Math.pow(Character.getNumericValue(number.charAt(i)),2);
        }
        n = sum;
        if(n == 1){
            numberOfNumber1++;
        }
        
        if(numberOfNumber1 == 2){
            n = a0;
        }        
        
        if(count > 16){
            return 16;
        }
        
        
    }while(n != a0);
    
    return count;
}