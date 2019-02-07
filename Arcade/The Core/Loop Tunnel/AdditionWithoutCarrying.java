int additionWithoutCarrying(int param1, int param2) {
    
    int p1Tam = (param1 + "").length();
    int p2Tam = (param2 + "").length();
    char[] individualNumbersP1;
    char[] individualNumbersP2;
    
    
    if(p1Tam > p2Tam){
        individualNumbersP2 = new char[p1Tam];
        individualNumbersP1 = (param1 + "").toCharArray();
        int dif = p1Tam - p2Tam;
        for(int i=0;i<dif;i++){
            individualNumbersP2[i] = '0';
        }
        for(int j=0;j<p2Tam;j++){
            individualNumbersP2[dif + j] = (param2 + "").charAt(j);
        }
    }
    
    else if(p2Tam > p1Tam){
        individualNumbersP1 = new char[p2Tam];
        individualNumbersP2 = (param2 + "").toCharArray();
        int dif = p2Tam - p1Tam;
        for(int i=0;i<dif;i++){
            individualNumbersP1[i] = '0';
        }
        
        for(int j=0;j<p1Tam;j++) {
            individualNumbersP1[dif + j] = (param1 + "").charAt(j);
        }
    }
    
    else{
        individualNumbersP1 = new char[p1Tam];
        individualNumbersP2 = new char[p2Tam];
        individualNumbersP1 = (param1 + "").toCharArray();
        individualNumbersP2 = (param2 + "").toCharArray();
    }        
    
    char[] result = new char[individualNumbersP1.length];
    
    for(int i=0;i<individualNumbersP1.length;i++){
        int sum = Character.getNumericValue(individualNumbersP1[i]) + 
            Character.getNumericValue(individualNumbersP2[i]);
        int dif = sum;
        if(sum >= 10){
            dif = sum - 10;
        }
        
        result[i] = (dif + "").charAt(0);
    }
    
    String lastResult = new String(result);
    
    return Integer.parseInt(lastResult);
}
