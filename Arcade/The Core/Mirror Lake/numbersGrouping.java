int numbersGrouping(int[] a) {
    
    if(a.length == 1){
        return 2;
    }
    
    int aSize = a.length;
    HashSet<Integer> groups = new HashSet<Integer>();
    
    for(int i=0;i<aSize;i++){ 
        int group = findGroup(a[i]); 
        groups.add(group);
    }
    
    return aSize + groups.size();
}

int findGroup(int number){
    
    if(number <= 10000){
        return 1;
    }    
    
    int group = 0;
    int i = (int) number / 10000;
    
    while(true){
        int rangeBegin = ((i - 1) * 10000) + 1;
        int rangeEnd = i * 10000;
        if(number >= rangeBegin && number <= rangeEnd){
            group = i;
            break;
        }
        i++;
    }
    
    return group;
}