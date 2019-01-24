boolean arithmeticExpression(int a, int b, int c) {
    if(a + b == c){
        return true;
    }else if(a - b == c){
        return true;
    }else if(a * b == c){
        return true;
    }else if(a % b == 0 && a / b == c){
        return true;
    }
    
    return false;
}
