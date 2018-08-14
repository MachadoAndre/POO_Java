import java.util.Scanner;
class exerc8b {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        String nomeAgrupado = "";
        String [] nomeFormatado = nome.split(" ");
        for(int indice = 0; indice < nomeFormatado.length;indice++)
            nomeAgrupado += nomeFormatado[indice];

        System.out.println(nomeAgrupado);
    }
}
