boolean higherVersion(String ver1, String ver2) {
    
    String[] newVer1 = ver1.split("\\.");
    String[] newVer2 = ver2.split("\\.");
    
    for(int i=0;i<newVer1.length;i++){
        
        System.out.println(Integer.parseInt(newVer1[i]));
        System.out.println(Integer.parseInt(newVer2[i]));
        
        if(Integer.parseInt(newVer1[i]) > Integer.parseInt(newVer2[i])){
            return true;
        }else if(Integer.parseInt(newVer1[i]) < Integer.parseInt(newVer2[i])){
            return false;
        }
    }
    
    return false;
}
