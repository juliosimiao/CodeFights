int phoneCall(int min1, int min2_10, int min11, int s) {
    
    int chargeMin2 = 9 * min2_10;
    
    if(s == 0 || s < min1){
        return 0;
    }
    
    if(s == min1) {
        return 1;
    }
    
    if(s < (chargeMin2 + min1)){
        int rest = s - min1;
        int minutes = (int) rest / min2_10;
        return 1 + minutes;
    }
    
    int restOfMoney = s - (min1 + chargeMin2);
    System.out.println(restOfMoney);
    int lastMinutes = (int) restOfMoney / min11;
    
    return 10 + lastMinutes;
}
