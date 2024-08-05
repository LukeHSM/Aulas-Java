/**
 * @author LukeHSM
*/
import java.util.Scanner;
public class Operacoes {
    static void efetuarOperacao(){
        Scanner read = new Scanner(System.in);
        System.out.print("\n\nDigite o número A: ");
        int num1 = Integer.valueOf(read.nextInt());
        System.out.print("Digite o número B: ");
        int num2 = Integer.valueOf(read.nextInt());
        System.out.printf("Digite a letra da opção desejada:%nADIÇÃO (A)%nSUBTRAÇÃO (S)%nMultiplicação (M)%nDIVISÃO (D)%n>>> ");
        String operacao = read.next().toUpperCase();
        switch (operacao) {
            case "A":
                System.out.printf("%n%d + %d = %.1f", num1, num2, (float)num1+num2);break;
            case "M":
                System.out.printf("%n%d * %d = %.1f", num1, num2, (float)num1*num2);break;
            case "D":
                System.out.printf("%n%d / %d = %.1f", num1, num2, (float)num1/num2);break;
            case "S":
                System.out.printf("%n%d - %d = %.1f", num1, num2, (float)num1-num2);break;
            default:
                System.out.println("\nOPERAÇÃO INCORRETA!!!\n\n");efetuarOperacao();break;
        }
        // Perguntando se quer continuar...Por algum motivo, não funcionou com o IF.
        System.out.printf("%n%nRealizar outra operação?%n: ");
        String continuar = read.next().toUpperCase();
        switch (continuar) {
            case "S":
                efetuarOperacao();break;
            case "SIM":
                efetuarOperacao();break;
            case "YES":
                efetuarOperacao();break;
        }
    }
    public static void main(String[] args) {
        efetuarOperacao();
    }
}