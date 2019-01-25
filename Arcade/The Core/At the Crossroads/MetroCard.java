int[] metroCard(int lastNumberOfDays) {
    
    int[] resultFirst = {31};
    
    if(lastNumberOfDays == 30) {
        int[] result = {31};
        return result;
    }else if(lastNumberOfDays == 31) {
        int[] result = {28,30,31};
        return result;
    }
    
    return resultFirst;
}
