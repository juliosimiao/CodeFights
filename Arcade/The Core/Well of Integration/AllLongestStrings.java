String[] allLongestStrings(String[] inputArray) {
    
    int maxLength = 1;
    ArrayList<String> longestStrings = new ArrayList<>();
    
    for(int i=0;i<inputArray.length;i++) {
        int LengthCurrentString = inputArray[i].length();
        if(LengthCurrentString > maxLength){
            maxLength = LengthCurrentString;
            longestStrings.clear();
            longestStrings.add(inputArray[i]);
        }else if(LengthCurrentString == maxLength){
            longestStrings.add(inputArray[i]);
        }
    }
    
    
    return longestStrings.toArray(new String[longestStrings.size()]);
}
