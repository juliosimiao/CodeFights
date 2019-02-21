int electionsWinners(int[] votes, int k) {
    
    List<Integer> list = Arrays.stream(votes).boxed().collect(Collectors.toList());
    Collections.sort(list);
    int maxValue = list.get(list.size() - 1);
    int possibilitesToWin = 0;
    
    if(k == 0){
        int numberOfCandidatesWithMax = 0;
        for(int i=0;i<votes.length;i++){
            if(votes[i] == maxValue){
                numberOfCandidatesWithMax++;
            }
            if(numberOfCandidatesWithMax > 1){
                return 0;
            }
        }
        return 1;
    }
    
    for(int i=0;i<votes.length;i++){
        if(votes[i] + k > maxValue){
            possibilitesToWin++;
        }
    }
    
    return possibilitesToWin;
}