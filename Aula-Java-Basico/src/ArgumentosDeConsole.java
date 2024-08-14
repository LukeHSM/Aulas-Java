/**
 * @author LukeHSM
 * @version 1.0.0
 * @since August 8th, 2024
 * @apiNote No console, na pasta bin: java ArgumentosDeConsole nome idade cidade/estado altura[em metros]
*/
import java.util.Locale;
import java.util.Scanner;

public class ArgumentosDeConsole {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome = read.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = read.next();
        System.out.print("Digite sua idade: ");
        int idade = read.nextInt();
        System.out.print("Digite sua altura: "); // em metros
        double altura = read.nextDouble(); // Digite com ponto, e não vírgula.

        System.out.printf("Oi, meu nome é %s %s!%n", nome, sobrenome);
        System.out.printf("Eu tenho %d anos de idade.%n", idade);
        System.out.printf("E tenho %.2f m de altura.%n", altura);
    }
}
