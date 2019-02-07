int leastFactorial(int n) {
    
    int x = 1;
    int i = 1;
    
    if(n == 1){
        return 1;
    }
    
    while(x < n){
        x *= i;
        i++;
    }
    
    return x;
}
