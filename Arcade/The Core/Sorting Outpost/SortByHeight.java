int[] sortByHeight(int[] a) {
    
    int aux = 0;

    for(int i=0;i<a.length - 1;i++){
        if(a[i] != -1){
            for(int j=i+1;j<a.length;j++){
                if(a[j] != -1){
                    if(a[j] < a[i]){
                        aux = a[j];
                        a[j] = a[i];
                        a[i] = aux;
                    }
                }
            }
        }
    }
    
    return a;
}
