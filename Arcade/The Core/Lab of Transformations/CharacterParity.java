String characterParity(char symbol) {
    
    int digit;
    
    if(!Character.isDigit(symbol)){
        return "not a digit";
    }
    
    digit = Character.getNumericValue(symbol);
    
    if(digit % 2 == 0) {
        return "even";
    }
    
    return "odd";
}