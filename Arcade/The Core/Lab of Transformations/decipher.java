String decipher(String cipher) {

    int i = 0;
    String res = "";
    String currentNumber = "";
    while(i < cipher.length()){
        currentNumber += cipher.charAt(i);
        int number = Integer.parseInt(currentNumber);
        if(number >= 97 && number <= 122){
            res += (char) number + "";
            currentNumber = "";
        }
        i++;
    }

    return res;
}