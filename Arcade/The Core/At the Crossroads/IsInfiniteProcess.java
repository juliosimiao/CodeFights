boolean isInfiniteProcess(int a, int b) {
    if(b == a){
        return false;
    }else if(b > a) {
        int dif = b - a;
        if(dif % 2 == 0){
            return false;    
        }        
    }
    
    return true;
}
