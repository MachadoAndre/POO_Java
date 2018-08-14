public class Numeros
{
    public static void main(String[] args){
        int numeroPerfeito = 0;
        int numero = 2;
        while(numeroPerfeito < 5){
            int somaDivisor = 1;
            for(int divisor=2; divisor<numero; divisor++){
                if(numero%divisor == 0){
                    somaDivisor += divisor;
                }
            }
            if(somaDivisor == numero){
                System.out.println(somaDivisor);
                numeroPerfeito++;
            }
            numero++;
        }
    }
}
