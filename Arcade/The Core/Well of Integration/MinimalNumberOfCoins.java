int minimalNumberOfCoins(int[] coins, int price) {
    
    int sum = 0;
    int numberOfCoins = 0;
    
    for(int i = coins.length - 1; i >= 0; i--){
        while(sum + coins[i] <= price) {
            sum += coins[i];
            numberOfCoins++;
        }        
    }
    
    return numberOfCoins;
}