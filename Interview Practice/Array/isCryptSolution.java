boolean isCryptSolution(String[] crypt, char[][] solution) {
    
    String[] number = new String[3];
    
    for(int i=0;i<crypt.length;i++){
        String current = crypt[i];
        String finalNumber = "";
        for(int j=0;j<current.length();j++){
            char letter = current.charAt(j);
            char numberFromSolution = returnNumberFromSolution(letter,solution);
            if(j == 0 && numberFromSolution == '0' && current.length() > 1){
                return false;
            }
            
            finalNumber = finalNumber + Character.toString(numberFromSolution);
        }        
        number[i] = finalNumber;
    }
    
    return checkAnswerFromSolution(number);

}

char returnNumberFromSolution (char letter, char[][] solution){
    int number = 0;
    for(int i = 0;i<solution.length;i++){
        if(solution[i][0] == letter){
            number = i;
            break;
        }
    }
    return solution[number][1];
}

boolean checkAnswerFromSolution(String[] numbers){
    
    long num1 = Long.parseLong(numbers[0]);
    long num2 = Long.parseLong(numbers[1]);
    long num3 = Long.parseLong(numbers[2]);
    
    if(num1 + num2 == num3){
        return true;
    }
    
    return false;
}