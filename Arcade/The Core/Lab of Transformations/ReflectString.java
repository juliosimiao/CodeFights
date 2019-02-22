String reflectString(String inputString) {
    
    StringBuilder stringBuilder = new StringBuilder(inputString);
    
    for(int i=0;i<stringBuilder.length();i++){
        char original = stringBuilder.charAt(i);
        int differenceFromBeggining = ((int) original) - 97;
        char newChar = (char) (122 - differenceFromBeggining);
        stringBuilder.setCharAt(i,newChar);
    }
    
    return stringBuilder.toString();
}
