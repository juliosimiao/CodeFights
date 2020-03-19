int comfortableNumbers(int l, int r) {
    
    int count = 0;
    
    for(int i=l;i<r;i++){
        for(int j=i+1;j<=r;j++){
            if(isConfortableNumber(i,j) && isConfortableNumber(j,i)){
                count++;
            }
        }
    }
    
    return count;
}

int sumOfDigits(int number) {
    String n = number + "";
    int sum = 0;
    for(int i=0;i<n.length();i++){
        sum += Character.getNumericValue(n.charAt(i));
    }
    return sum;
}


boolean isConfortableNumber(int x, int y){
    int[] segment = new int[2];
    if(x != y){
        segment[0] = x - sumOfDigits(x);
        segment[1] = x + sumOfDigits(x);
        if(y >= segment[0] && y <= segment[1]){
            segment[0] = y - sumOfDigits(y);
            segment[1] = y + sumOfDigits(y);
            if(x >= segment[0] && x <= segment[1]){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }else {
        return false;
    }
}