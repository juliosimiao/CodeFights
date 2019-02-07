int rounders(int n) {
    
    StringBuilder number = new StringBuilder(n + "");
    
    for(int i=number.length()-1; i>0; i--){
        int value = Character.getNumericValue(number.charAt(i)); 
        if(value < 5 && value > 0){
            number.setCharAt(i,'0');
        }else if(value >= 5){
            int pos = i - 1;
            if(pos >= 0) {
                number.setCharAt(i,'0');
                int previousValue = Character.getNumericValue(number.charAt(pos));
                int sum = previousValue + 1;
                number.replace(pos, pos + 1, sum + "");
            }
        }
    }
    
    return Integer.parseInt(number.toString());
}