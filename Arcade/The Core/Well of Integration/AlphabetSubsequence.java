boolean alphabetSubsequence(String s) {
    
    StringBuilder stringBuilder = new StringBuilder(s.toLowerCase());
    
    for(int i=0;i<stringBuilder.length() - 1;i++) {
        int currentLetter = (int) stringBuilder.charAt(i);
        int nextLetter = (int) stringBuilder.charAt(i + 1);        
        if(nextLetter <= currentLetter){
            return false;
        }
    }
    
    return true;
}