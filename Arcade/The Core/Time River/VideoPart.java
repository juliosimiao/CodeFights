int[] videoPart(String part, String total) {
    
    int[] result = new int[2];
    int max = 0;
    int min = 0;
    int maxDivisor;
    String[] partTime = part.split(":");
    String[] totalTime = total.split(":");
    
    int hoursPart = Integer.parseInt(partTime[0]);
    int minutesPart = Integer.parseInt(partTime[1]);
    int secondsPart = Integer.parseInt(partTime[2]);
    int hoursTotal = Integer.parseInt(totalTime[0]);
    int minutesTotal = Integer.parseInt(totalTime[1]);
    int secondsTotal = Integer.parseInt(totalTime[2]);
    
    int partInSeconds = ((hoursPart * 60) * 60) + (minutesPart * 60) + secondsPart;
    int TotalInSeconds = ((hoursTotal * 60) * 60) + (minutesTotal * 60) + secondsTotal;
    
    System.out.println(partInSeconds);
    System.out.println(TotalInSeconds);
    
    if(partInSeconds > TotalInSeconds){
        max = partInSeconds;
        min = TotalInSeconds;
    }else{
        max = TotalInSeconds;
        min = partInSeconds;
    }
    
    maxDivisor = findTheMaxDivisor(max,min);
    
    if(maxDivisor == 0){
        result[0] = partInSeconds;
        result[1] = TotalInSeconds;
    }else {
        result[0] = partInSeconds / maxDivisor;
        result[1] = TotalInSeconds / maxDivisor;
    }
    
    return result;
}

int findTheMaxDivisor(int max, int min){
    
    int divisor = 0;
    
    for(int i=min;i>1;i--){
        if(max % i == 0){
            if(min % i == 0){
                return i;
            }
        }
    }
    
    return divisor;
}