char firstNotRepeatingCharacter(String s) {

    LinkedHashMap<Character,Integer> letters = new LinkedHashMap<>();

    if(s.length() == 1){
        return s.charAt(0);    
    }

    letters.put(s.charAt(0),0);

    for(int i=0;i<s.length();i++){
        Integer value = letters.get(s.charAt(i));
        if(value == null){
            letters.put(s.charAt(i), 0);
        }else {
            letters.put(s.charAt(i), value + 1);
        }
    }
    
    if(letters.containsValue(0)){
        for(Character key : letters.keySet() ) {
            if(letters.get(key) == 0){
                return key;
            }
        }
    }

    return '_';
}
