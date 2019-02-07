int[] replaceMiddle(int[] arr) {
    
    ArrayList<Integer> list = new ArrayList<>();
    int size = arr.length;
    int middleIndex = 0;
    int middleElement = 0;
    
    if(size % 2 == 0){
        middleIndex = size / 2;
        middleElement = arr[middleIndex] + arr[middleIndex - 1];
        for(int i = 0;i<arr.length;i++){
            if(i == (middleIndex - 1)) {
                list.add(middleElement);
                i++;
            }else{
                list.add(arr[i]);    
            }            
        }
    }else{
        middleIndex = (size - 1) / 2;
        middleElement = arr[middleIndex];    
        for(int i = 0;i<arr.length;i++){
            if(i != middleIndex) {
                list.add(arr[i]);    
            }else{
                list.add(middleElement);
            }            
        }
    }
    
    int[] newArray = new int[list.size()];
    
    for(int j=0;j<list.size();j++) {
        newArray[j] = list.get(j);
    }
    
    return newArray;
}