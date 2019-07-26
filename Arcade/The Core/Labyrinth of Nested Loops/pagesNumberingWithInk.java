int pagesNumberingWithInk(int current, int numberOfDigits) {
    
    int last = current;
    int available = numberOfDigits - (int) (Math.log10(current) + 1);
    
    while(available >= 0 ){
        last = current;
        int next = current + 1;
        available = available - (int) (Math.log10(next) + 1);
        current = next;
    }
    
    
    return last;
}
