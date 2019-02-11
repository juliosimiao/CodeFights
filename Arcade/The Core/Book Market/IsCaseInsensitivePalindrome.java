boolean isCaseInsensitivePalindrome(String inputString) {
    
    StringBuilder stringBuilder = new StringBuilder(inputString.toLowerCase());
    
    if(stringBuilder.toString().equals(stringBuilder.reverse().toString())){
        return true;
    }
    
    return false;
}