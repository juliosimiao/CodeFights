String[] domainType(String[] domains) {
    
    ArrayList<String> result = new ArrayList<>();
    Map<String,String> translateDomain = new HashMap<String,String>();
    translateDomain.put("com","commercial");
    translateDomain.put("org","organization");
    translateDomain.put("net","network");
    translateDomain.put("info","information");
    
    for(int i=0;i<domains.length;i++){
        System.out.println(domains[i]);
        String[] domainParts = domains[i].split("\\."); 
        System.out.println(domainParts.length);
        result.add(translateDomain.get(domainParts[domainParts.length - 1]));
    }
    
    return result.stream().toArray(String[]::new);
}
