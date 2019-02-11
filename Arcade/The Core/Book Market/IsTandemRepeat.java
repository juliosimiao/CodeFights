boolean isTandemRepeat(String inputString) {
    
    int size = inputString.length();
    
    if(size % 2 == 0){
        int half = size / 2;
        String a = inputString.substring(0,half);
        String b = inputString.substring(half,size);
        if(!a.equals(b)){
            return false;
        }
    }else {
        return false;
    }

    return true;
}