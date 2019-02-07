int makeArrayConsecutive2(int[] statues) {
    
    List<Integer> list = Arrays.stream(statues).boxed().collect(Collectors.toList());
    Collections.sort(list);
    int count = 0;
    
    for(int i=(list.get(0) + 1); i<list.get(list.size() - 1); i++) {
        if(!list.contains(i)){
            count++;
        }
    }
    
    return count;
}    