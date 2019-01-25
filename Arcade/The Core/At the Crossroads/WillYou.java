boolean willYou(boolean young, boolean beautiful, boolean loved) {
    if(young == true && beautiful == true && loved == false) {
        return true;
    }else if( ( young == false || beautiful == false ) && loved == true) {
        return true;
    }else if(young == false && beautiful == false && loved == false) {
        return false;
    }
    
    return false;
}