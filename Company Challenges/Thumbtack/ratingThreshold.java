int[] ratingThreshold(double threshold, int[][] ratings) { 
    int res[] = {};
    ArrayList<Integer> reviewManually = new ArrayList<>();
    
    if(ratings.length == 0){
        return res;
    }else {
        for(int i=0;i<ratings.length;i++){
            int collumnsSize = ratings[i].length; 
            int sum = 0;
            for(int j=0;j<collumnsSize;j++){
                sum += ratings[i][j];
            }
            double average = sum / (double) collumnsSize;
            if(average < threshold){
                reviewManually.add(i);
            }
        }    
    }
    
    return reviewManually.stream().mapToInt(i -> i).toArray();
}