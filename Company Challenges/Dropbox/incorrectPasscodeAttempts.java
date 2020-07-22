boolean incorrectPasscodeAttempts(String passcode, String[] attempts) {
    
    int wrongAttemp = 0;
    
    for(int i=0;i<attempts.length;i++){
        if(!attempts[i].equals(passcode)){
            wrongAttemp++;
            if(wrongAttemp >= 10){
                return true;
            }
        }else {
            wrongAttemp = 0;
        }
    }
    
    return false;
}