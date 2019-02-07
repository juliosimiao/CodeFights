int magicalWell(int a, int b, int n) {
    
    int sum = 0;
    
    for(int i=0;i<n;i++){
        int times = a * b;
        sum += times;
        a++;
        b++;
    }
    
    return sum;
}
