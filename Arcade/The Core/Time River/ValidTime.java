boolean validTime(String time) {
    
    String t[] = time.split(":");
    
    int HH = Integer.parseInt(t[0]);
    int MM = Integer.parseInt(t[1]);
    if(HH > 23){
         return false;
    }
    if(MM > 59){
        return false;
    }

    return true;    
}