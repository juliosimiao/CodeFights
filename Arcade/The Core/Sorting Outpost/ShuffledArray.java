int[] shuffledArray(int[] shuffled) {
    
    int sumNewArray = 0;
    int sumOldArray;
    List<Integer> list = Arrays.stream(shuffled).boxed().collect(Collectors.toList());
    
    for(int i=0;i<list.size();i++){
        sumNewArray += list.get(i);
    }
    
    sumOldArray = sumNewArray / 2;
    
    int index = list.indexOf(sumOldArray);
    if(index != -1){
        list.remove(index);
    }  
    
    Collections.sort(list);
    
    return list.stream().mapToInt(Integer::intValue).toArray();
}