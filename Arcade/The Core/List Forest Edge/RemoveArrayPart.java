int[] removeArrayPart(int[] inputArray, int l, int r) {

    ArrayList<Integer> list = new ArrayList<>();    
    
    for(int i=0;i<inputArray.length;i++){
        if(!(i >= l && i <= r)){
            list.add(inputArray[i]);
        }
    }
    
    int[] newArray = new int[list.size()];
    
    for(int j=0;j<list.size();j++){
        newArray[j] = list.get(j);
    }   
    
    
    return newArray;
}
