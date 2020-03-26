boolean pairOfShoes(int[][] shoes) {

    ArrayList<String> mapShoes = new ArrayList<>();
    
    for(int i=0;i<shoes.length;i++){
        String sideSize = "" + shoes[i][0] + shoes[i][1] + "";
        String otherSide = getOtherSide(shoes[i][0],shoes[i][1]);
        if(mapShoes.indexOf(otherSide) == -1){
            mapShoes.add(sideSize);
        }else {
            mapShoes.remove(otherSide);
        }     
    }  
    
    if(mapShoes.size() == 0){
        return true;
    }    
    
    return false;
}

String getOtherSide(int side, int size){
    String otherSide = "";
    if(side == 0){
        otherSide = "1" + size; 
    }else {
        otherSide = "0" + size;
    }
    
    return otherSide;
}