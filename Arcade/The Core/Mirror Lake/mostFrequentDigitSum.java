int mostFrequentDigitSum(int n) {
  
	int number = n;
  	HashMap<Integer, Integer> digits = new HashMap<Integer, Integer>();
  
  	while(number > 0){
  		int sumDigits = getSum(number);
    	if(digits.containsKey(sumDigits)){
      	digits.put(sumDigits, digits.get(sumDigits)+1);
    	}else{
      		digits.put(sumDigits, 1);
    	}
    	number = number - sumDigits;
	}
  
  	if(digits.containsKey(0)){
    	digits.put(0, digits.get(0)+1);
  	}else{
    	digits.put(0, 1);
  	}
  
  	return getMostFrequentNumber(digits);
}

int getSum(int n) {     

    int sum = 0; 
    while (n > 0) {
      sum = sum + n % 10;
      n = n / 10;
    }
      
    return sum; 
}

int getMostFrequentNumber(HashMap<Integer, Integer> list){
  
	Integer mostFrequented = Integer.MIN_VALUE;
  	int frequency = 0;
  
  	for (Integer key : list.keySet()) {
    	if(list.get(key) > frequency){
      		frequency = list.get(key);
      		mostFrequented = key;
    	}else if(list.get(key) == frequency && key > mostFrequented){
      		mostFrequented = key;  
    	}
  	}
  
  	return mostFrequented;
}