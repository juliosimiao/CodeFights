int uniqueDigitProducts(int[] a) {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i=0;i<a.length;i++){
        int product = 1;
        String number = a[i] + "";
        for(int j=0;j<number.length();j++){
            product *= Character.getNumericValue(number.charAt(j));
        }
        if(!list.contains(product)){
            list.add(product);
        }
    }
    
    return list.size();
}