String[] fileNaming(String[] names) {

    if(names.length == 0){
        String[] emptyArray = new String[0];
        return emptyArray;
    }

    ArrayList<String> newNames = new ArrayList<>();
    HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
    
    nameCount.put(names[0],0);
    newNames.add(names[0]);

    for(int i=1;i<names.length;i++){
        Integer currentCount = nameCount.get(names[i]);
        if(currentCount != null){
            String newName = "";
            if(names[i].contains("(") == true){
                newName = names[i] + "(1)"; 
                if(nameCount.get(newName) != null){
                    int nextNumber = getNextAvailableNumber(nameCount, names[i], currentCount);
                    newName = names[i] + "(" + nextNumber + ")";
                }                
                nameCount.put(newName,0);                
            }else {
                newName = names[i] + "(" + (currentCount + 1) + ")";
                if(nameCount.get(newName) != null){
                    int nextNumber = getNextAvailableNumber(nameCount, names[i], currentCount);
                    newName = names[i] + "(" + (nextNumber) + ")";
                    nameCount.put(newName,0);
                }else {
                    nameCount.put(newName,0);
                    nameCount.put(names[i],(currentCount + 1));
                }               
            }
            newNames.add(newName);
        }else {
            nameCount.put(names[i],0);
            newNames.add(names[i]);
        }
    }

    return newNames.stream().toArray(String[]::new);
}

int getNextAvailableNumber(HashMap<String, Integer> nameCount, String currentName, Integer currentCount){
    int j = (currentCount + 2);
    boolean newAvailable = false; 
    while(newAvailable != true){
        Integer next = nameCount.get(currentName + "(" + (currentCount + j) + ")");
        if(next == null){
            newAvailable = true;
        }else {
            j++;
        }
        
    }

    return j;
}
