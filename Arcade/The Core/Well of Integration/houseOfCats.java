int[] houseOfCats(int legs) {
    
    int[] result;
    
    if(legs < 2){
        result = new int[1];
        result[0] = 0;
        return result;
    }
    
    if(legs == 2){
        result = new int[1];
        result[0] = 1;
        return result;
    }
    
    ArrayList<Integer> list = new ArrayList<>();
    int legsPerson = 2;
    int legsCat = 4;
    int endFor = (int) legs / legsPerson;
    
    for(int i=0;i<=endFor;i++){
        int people = i * legsPerson;
        int remainedLegs = legs - people;
        if(remainedLegs > 0){
            if(remainedLegs % legsCat == 0){
                list.add(i);
            }
        }else if(remainedLegs == 0 && people <= legs){
            list.add(i);
        }
    }
    
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    
    return list.stream().mapToInt(Integer::intValue).toArray();
}
