/**
 * Verifica se um número é primo ou não.
 * 
 * @author André Machado
 * @version 06/08/2018
 */
public class numerosPrimos
{
    public static void main(String[] args){
        int numero=7,i=2;
        String resposta;
        
        while(numero%i!=0){i++;}
        
        resposta = numero == i ? " é primo!" : " não é primo!";
        System.out.println("O valor " + numero + resposta);
    }
}
