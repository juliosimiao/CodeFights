boolean launchSequenceChecker(String[] systemNames, int[] stepNumbers) {
    
    Map<String,Integer> sequences = new HashMap<String,Integer>();
    
    if(systemNames.length == 1){
        return true;
    }else if(systemNames.length == 2){
        return stepNumbers[0] <= stepNumbers[1];
    }
    
    for(int i=0;i<systemNames.length;i++){
        String currentSystemName = systemNames[i];
        if(sequences.get(currentSystemName) == null){
            sequences.put(currentSystemName, stepNumbers[i]);
        }else {
            if(sequences.get(currentSystemName) >= stepNumbers[i]){
                return false;
            }else {
                sequences.put(currentSystemName, stepNumbers[i]);
            }
        }
    }
    
    return true;
}
