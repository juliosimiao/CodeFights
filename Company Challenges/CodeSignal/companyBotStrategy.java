double companyBotStrategy(int[][] trainingData) {
    double sum = 0.0;
    int correctnessCount = 0;
    
    for(int i=0;i<trainingData.length;i++){
        int correctness = trainingData[i][1];
        if(correctness == 1){
            sum += trainingData[i][0];
            correctnessCount++;
        }
    }
    
    if(sum == 0.0){
        return sum;
    }
    
    return sum / (double) correctnessCount;
}