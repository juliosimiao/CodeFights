boolean isMAC48Address(String inputString) {
    
    boolean result = true;
    
    if(inputString.length() != 17){
        return false;
    }
    
    String[] inputWithoutHyphen = inputString.split("-");
    if(inputWithoutHyphen.length != 6){
        return false;
    }
    
    for(int i=0;i<inputWithoutHyphen.length;i++){
        int c1 = (int) inputWithoutHyphen[i].charAt(0);
        int c2 = (int) inputWithoutHyphen[i].charAt(1);
        
        System.out.println(c1);
        System.out.println(c2);
        
        if(!Character.isDigit(c1)){
            if(c1 >= 65 && c1 <= 70){
                result = true;
            }else{
                return false;
            }
        }
        if(!Character.isDigit(c2)){
            if(c2 >= 65 && c2 <= 70){
                result = true;
            }else {
                return false;
            }
        }
    }
    
    return result;
}