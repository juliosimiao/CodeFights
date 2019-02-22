String stolenLunch(String note) {
    
    StringBuilder stringBuilder = new StringBuilder("");
    int a = 97;
    int j = 106;   
    
    for(int i=0;i<note.length();i++){        
        char c = note.charAt(i);
        if(!Character.isDigit(c)){
            int numberOfChar = (int) c;
            if(numberOfChar >= a && numberOfChar <= j){
                int newDigit = numberOfChar - 97;
                stringBuilder.append(newDigit);
            }else {
                stringBuilder.append(note.charAt(i));
            }
        }else {
            char newLetter = (char) (Character.getNumericValue(note.charAt(i)) + 97);  
            stringBuilder.append(newLetter);
        }
    }

    return stringBuilder.toString();
}