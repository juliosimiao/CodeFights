int arrayConversion(int[] inputArray) {
    
    List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
    int operation = 1;
    
    for(int i=0;i<list.size();i++){
        if(i != list.size() - 1){
            if(operation == 1){
                int j = i;
                while(j < list.size()){
                    if((j + 1) % 2 != 0){
                        int sum = list.get(j) + list.get(j+1);
                        list.set(j,sum);
                        list.set(j+1,Integer.MIN_VALUE);
                    }
                    j++;
                }
            
                for(int y=0;y<list.size();y++) {
                    if(list.get(y) == Integer.MIN_VALUE){
                        list.remove(y);
                    }    
                }
            
                operation = 2;
                i--;
            }else{
                int j = i;
                while(j < list.size()){
                    if(j % 2 == 0){
                        int product = list.get(j) * list.get(j+1);
                        list.set(j,product);
                        list.set(j+1,Integer.MIN_VALUE);
                    }
                    j++;
                }
            
                for(int y=0;y<list.size();y++) {
                    if(list.get(y) == Integer.MIN_VALUE){
                        list.remove(y);
                    }    
                }
            
                operation = 1;
                i--;
            }
        }
    }
    
    return list.get(0);
}