import java.util.Scanner;
class exerc8b {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        String [] nomeFormatado = nome.split(" ");
        int espacosEmBranco = (int)nomeFormatado.length;
        espacosEmBranco--;
        System.out.println("O nome possui " + espacosEmBranco + " espaco(s) em branco.");
    }
}
