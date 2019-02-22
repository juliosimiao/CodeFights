String[] newNumeralSystem(char number) {
    
    ArrayList<String> list = new ArrayList<>();
    int numberDecimal = ((int) number) - 65;
    
    for(int i=0;i<=numberDecimal;i++){
        for(int j=0;j<=numberDecimal;j++){
            if(i + j == numberDecimal){
                char number1 = (char) (i + 65);
                char number2 = (char) (j + 65);
                String sum = Character.toString(number1) + " + " + 
                    Character.toString(number2);
                String sumOppositeWay = Character.toString(number2) + " + " +      
                    Character.toString(number1);
                if(!list.contains(sumOppositeWay)){
                    System.out.println(sum);
                    list.add(sum);
                }
            }
        }
    }
    
    return list.toArray(new String[list.size()]);
}