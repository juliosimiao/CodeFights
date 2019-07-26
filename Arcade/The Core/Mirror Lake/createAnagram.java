int createAnagram(String s, String t) {

    int[] sHistogram = new int[26];
    int[] THistogram = new int[26];
    
    for(int i=0;i<s.length();i++){
        int Sindex = findWhereToStoreValue(s.charAt(i));
        int Tindex = findWhereToStoreValue(t.charAt(i));
        
        sHistogram[Sindex] = sHistogram[Sindex] + 1;
        THistogram[Tindex] = THistogram[Tindex] + 1;
    }
    
    return getNumberOfReplacements(sHistogram,THistogram);    
}

int findWhereToStoreValue(char c){
    return (int)c - 65;
}

int getNumberOfReplacements(int[] sHistogram, int[] tHistogram){
    
    int sum = 0;
    int diff = 0;
    
    for(int i=0;i<sHistogram.length;i++){
        diff = Math.abs(sHistogram[i] - tHistogram[i]); 
        sum += diff;
    } 
    
    return sum / 2;
}