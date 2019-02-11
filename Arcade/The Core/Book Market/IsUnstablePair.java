boolean isUnstablePair(String filename1, String filename2) {
    
    int orderBefore = 0;
    int orderAfter = 0;
    
    int beforeCase = filename1.compareTo(filename2);
    int afterCase = filename1.toLowerCase().compareTo(filename2.toLowerCase());
    
    if(beforeCase > 0){
        orderBefore = 1;
    }else if(beforeCase < 0){
        orderBefore = 2;
    }else{
        orderBefore = 0;
    }
    
    if(afterCase > 0){
        orderAfter = 1;
    }else if(afterCase < 0){
        orderAfter = 2;
    }else{
        orderAfter = 0;
    }
    
    if(orderAfter == orderBefore){
        return false;
    }
    
    return true;
}