import java.util.Scanner;
public class Nome {    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String [] nomeAlterado = nome.split(" ");
        System.out.print(nomeAlterado[nomeAlterado.length-1] + ",");
        for(int indice=0;indice<=nomeAlterado.length-2;indice++){
            if(indice == 0)
                System.out.print(nomeAlterado[indice] + " ");
            else  
                System.out.print(nomeAlterado[indice].charAt(0) + ". ");
        }
    }
}
