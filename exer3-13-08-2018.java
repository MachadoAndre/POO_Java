class exerc3 {
    public static void verificaPrimo(int termo1){
        int i;
        for(i=2;termo1%i!=0 && termo1>1;i++);    
        if(i == termo1)
            System.out.println(" e primo!");
        else 
            System.out.println(" NAO e primo!");
    }
    public static void main(String [] args){
        int termoRequirido = 30,termo1 = 0, termo2 = 1,aux; 
        for(int indice=0;indice<termoRequirido;indice++){
            System.out.print(termo1 + " "); 
            verificaPrimo(termo1);
            aux = termo1;
            termo1 = termo2;
            termo2 = aux + termo2;
        }
    }
}
