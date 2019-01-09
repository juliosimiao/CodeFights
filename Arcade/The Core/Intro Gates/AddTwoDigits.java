int addTwoDigits(int n) {
    
    int sum = 0;
    
    String number = n + "";
    for(int i=0;i<number.length();i++){
        int x = Integer.parseInt(number.charAt(i) + "");
        sum += x;
    }
    
    return sum;
}
