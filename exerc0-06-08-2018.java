import java.util.Scanner;
public class numerosPrimos
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt(),i=2;
        String resposta;
        while(numero%i!=0){i++;}
        resposta = numero == i ? " é primo!" : " não é primo!";
        System.out.println("O valor " + numero + resposta);
    }
}
