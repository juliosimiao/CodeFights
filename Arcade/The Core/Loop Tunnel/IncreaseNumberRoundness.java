boolean increaseNumberRoundness(int n) {
    
    String number = n + "";
    
    for(int i=number.length() - 1;i>0;i--){
        int current = Character.getNumericValue(number.charAt(i));
        int previous = Character.getNumericValue(number.charAt(i - 1));
        if(previous != 0){
            int positionOfPrevious = i - 2;
            if(positionOfPrevious >= 0){
                if(Character.getNumericValue(number.charAt(positionOfPrevious)) == 0){
                    return true;
                }
            }            
        }
        else if(current != 0 && previous == 0){
            return true;
        }
    }
    return false;
}
