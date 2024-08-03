/**
 * @author LukeHSM
 * @version 1.0.0
 * @since August 8th, 2024
 * @apiNote No console, na pasta bin: java ArgumentosDeConsole nome idade cidade/estado altura[em metros]
*/

public class ArgumentosDeConsole {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        String cidade = args[2];
        double altura = Double.valueOf(args[3]); // Digite com ponto, e não vírgula.

        System.out.printf("Oi, meu nome é %s!%n", nome);
        System.out.printf("Eu tenho %d anos de idade.%n", idade);
        System.out.printf("Eu moro em %s.%n", cidade);
        System.out.printf("E tenho %.2f m de altura.%n", altura);
    }
}
