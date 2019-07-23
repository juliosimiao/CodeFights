String[] lrc2subRip(String[] lrcLyrics, String songLength) {    
    
    
    String[] res = new String[2];
    ArrayList<String> arryOfLyrics = new ArrayList<>();
    
    for(int i=0;i<lrcLyrics.length;i++){
        arryOfLyrics.add((i+1) + "");
        String current = lrcLyrics[i];
        String timestamp = current.substring(1,9) + "0";         

        String timestampAfterCalc = calcNewTimesTamp(timestamp);               
        
        int currentSize = current.length();
        String songLine = "";
        
        if(currentSize > 10){
            songLine = current.substring(11,currentSize);
        }

        if(i != (lrcLyrics.length) - 1){
            String nextTimeStamp = nextTimeStamp = lrcLyrics[i+1].substring(1,9) + "0";
            arryOfLyrics.add(timestampAfterCalc + " --> " + calcNewTimesTamp(nextTimeStamp));
            arryOfLyrics.add(songLine);
            arryOfLyrics.add("");
        }else {
            songLength = songLength + ",000";
            arryOfLyrics.add(timestampAfterCalc + " --> " + songLength);
            arryOfLyrics.add(songLine);
        }
    }
    
    for(int i=0;i<arryOfLyrics.size();i++){
        System.out.println(arryOfLyrics.get(i));
    }
    
    return arryOfLyrics.stream().toArray(String[]::new);

}

String calcNewTimesTamp(String timestamp){
    
    String[] timestampDivided = timestamp.split(":");
    double hh = Float.parseFloat(timestampDivided[0]);
    String newTimestamp = "";
    
    if(hh > 60){
        int diff = (int)hh - 60;
        double hhh = hh / 60;
        int integerHHH = (int) hh / 60; 
        double mm = ((integerHHH - hhh) * -1) * 60;
        long x = Math.round(mm);
        String newX = "";
        if(x < 10){
            newX = "0" + x;
        }else{
            newX = x + "";
        }
        newTimestamp = integerHHH + ":" + newX + ":" + timestampDivided[1];
        newTimestamp = newTimestamp.replace('.',',');
        if(integerHHH < 10){
            newTimestamp = "0" + newTimestamp;
        }
    }else if(hh > 0 && hh <= 59){
        return calcNewTimesWhenLessThan59(timestamp);
    }
    else {
        return calcNewTimesWhenEqualZero(timestampDivided[1]);
    }
    
    return newTimestamp;
}

String calcNewTimesWhenEqualZero(String timestamp) {
    String string = timestamp.replace('.',',');
    return "00:00:" + string;
}

String calcNewTimesWhenLessThan59(String timestamp){
    String string = timestamp.replace('.',',');
    return "00:" + string;
}
