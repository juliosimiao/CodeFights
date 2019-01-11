int maxMultiple(int divisor, int bound) {
    
    int result = 0;
    
    for(int i=bound;i>0;i--){
        if( (i % divisor) == 0){
            result = i;
            break;
        }
    }
    
    return result;
}
