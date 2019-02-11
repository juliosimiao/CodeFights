boolean isPower(int n) {
    
    if(n == 1){
        return true;
    }
    
    for(int i=2;i<21;i++){
        for(int j=2;j<21;j++){
            if(Math.pow(i,j) == n){
                return true;
            }        
        }
    }
    
    return false;
}