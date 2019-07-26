int[] weakNumbers(int n) {
    
    int res[] = new int[2];
    int maxWeakness = 0;
    int hasWeaknessLevel = 1;
    ArrayList<Integer> div = new ArrayList<>();
    
    if(n == 1){
        res[0] = maxWeakness;
        res[1] = hasWeaknessLevel;
        return res;
    }
    
    div.add(1);    

    for(int i=2;i<=n;i++){
        int numberDivisors = checkNumberDivisors(i);
        int weakness = 0;
        for(int j=0;j<div.size();j++){
            if(div.get(j) > numberDivisors){
                weakness++;
            }
        }
    
        if(weakness > maxWeakness){
            maxWeakness = weakness;
            hasWeaknessLevel = 1;
        }else if(weakness == maxWeakness){
            hasWeaknessLevel++;
        }
        
        div.add(numberDivisors);
    }
    
    res[0] = maxWeakness;
    res[1] = hasWeaknessLevel;
    
    return res;
}

int checkNumberDivisors(int n){
    
    int divisors = 0;
    
    for(int i=n;i>0;i--){
        if(n % i == 0){
            divisors++;
        }
    }
    
    return divisors;
}