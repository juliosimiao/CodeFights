int lineUp(String commands) {
    
    int count = 0;
    char positionOthers = 'F';
    char positionIncorrect = 'F';
        
    for(int i=0;i<commands.length();i++){
        char command = commands.charAt(i);
        positionOthers = checkNewPosition(positionOthers,command,"Others");
        positionIncorrect = checkNewPosition(positionIncorrect,command,"Incorrect");
        if(positionOthers == positionIncorrect){
            count++;   
        }
    }
    
    return count;
}

char checkNewPosition(char currentPos, char command, String person){
    
    char newPos = '0';
    
    if(currentPos == 'F' && command == 'L'){
        if(person.equals("Others")){
            newPos = 'L';
        }else {
            newPos = 'R';
        }
    }
    
    else if(currentPos == 'F' && command == 'R'){
        if(person.equals("Others")){
            newPos = 'R';
        }else {
            newPos = 'L';
        }
    }
    
    else if(currentPos == 'F' && command == 'A'){
        newPos = 'B';
    }
    
    else if(currentPos == 'L' && command == 'L'){
        if(person.equals("Others")){
            newPos = 'B';
        }else {
            newPos = 'F';
        }
    }
    
    else if(currentPos == 'L' && command == 'R'){
        if(person.equals("Others")){
            newPos = 'F';
        }else {
            newPos = 'B';
        }
    }
    
    else if(currentPos == 'L' && command == 'A'){
        newPos = 'R';
    }
    
    else if(currentPos == 'R' && command == 'L'){
        if(person.equals("Others")){
            newPos = 'F';
        }else {
            newPos = 'B';
        }
    }
    
    else if(currentPos == 'R' && command == 'R'){
        if(person.equals("Others")){
            newPos = 'B';
        }else {
            newPos = 'F';
        }
    }
    
    else if(currentPos == 'R' && command == 'A'){
        newPos = 'L';
    }
    
    else if(currentPos == 'B' && command == 'L'){
        if(person.equals("Others")){
            newPos = 'R';
        }else {
            newPos = 'L';
        }
    }
    
    else if(currentPos == 'B' && command == 'R'){
        if(person.equals("Others")){
            newPos = 'L';
        }else {
            newPos = 'R';
        }
    }
    
    else if(currentPos == 'B' && command == 'A'){
        newPos = 'F';
    }
    

    return newPos;
}
