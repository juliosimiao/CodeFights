int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    if(weight1 + weight2 <= maxW){
        return value1 + value2;        
    }
    
    else if(weight1 + weight2 > maxW){
        if(maxW >= weight1 && maxW >= weight2) {
            if(value1 > value2) {
                return value1;
            }else {
                return value2;
            }            
        }else {
            if(weight1 > maxW && weight2 <= maxW){
                return value2;
            }else if(weight2 > maxW && weight1 <= maxW ){
                return value1;
            }
        }        
    }
    
    return 0;
}
