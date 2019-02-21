int timedReading(int maxLength, String text) {
    
    String[] words = text.split(" ");
    int numberOfWords = 0;
    
    for(int i=0;i<words.length;i++){
        if(words[i].length() > maxLength){
            int numbersOfLetters = 0;
            for(int j=0;j<words[i].length();j++){
                if(Character.isLetter(words[i].charAt(j))){
                    numbersOfLetters++;                    
                }
            }
            if(numbersOfLetters <= maxLength && numbersOfLetters > 0){
                numberOfWords++;
            }
        }else {
            numberOfWords++;
        }
    }
    
    return numberOfWords;
}