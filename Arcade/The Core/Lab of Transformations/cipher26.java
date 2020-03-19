String cipher26(String message) {
    
    String result = "";
    int total = 0;
    for(int i=0;i<message.length();i++){
        int numberLetter = letterToNumber(message.charAt(i));
        int newTotal = numberLetter - total;
        int diff = 0;
        if(newTotal < 0){
            diff = 26 + newTotal;
        }else {
            diff = newTotal;
        }
        char letter = (char) numberToLetter(diff);
        total += newTotal;
        result = result + letter + "";
    }    
    
    return result;
}
int letterToNumber(char letter){
    return (int) letter - 97;
}

int numberToLetter(int number){
    return number + 97;
}