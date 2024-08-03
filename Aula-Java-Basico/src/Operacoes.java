import java.util.Scanner;

public class Operacoes {

    static void efetuarOperacao(){
        
        // Refatorar? (colocar esse início em um método específico?) - Daqui...
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o número A: ");
        int num1 = Integer.valueOf(read.nextInt());
        System.out.print("Digite o número B: ");
        int num2 = Integer.valueOf(read.nextInt());
        System.out.printf("Digite a letra da opção desejada:%nADIÇÃO (A)%nSUBTRAÇÃO (S)%nMultiplicação (M)%nDIVISÃO (D)%n>>> ");
        String operacao = read.next().toUpperCase();
        // ...Até aqui? tem como retornar dois tipos diferentes? "return num1, num2, operacao"????

        switch (operacao) {
            case "A":
                System.out.printf("%n%d + %d = %.1f", num1, num2, (float)num1+num2);
                // Criar um método (Em cada CASE, perguntar se quer fazer outra operacao e reiniciar esse método atual)????
                break;
            case "M":
                System.out.printf("%n%d * %d = %.1f", num1, num2, (float)num1*num2);
                break;
            case "D":
                System.out.printf("%n%d / %d = %.1f", num1, num2, (float)num1/num2);
                break;
            case "S":
                System.out.printf("%n%d - %d = %.1f", num1, num2, (float)num1-num2);
                break;
            default:
                System.out.println("\nOPERAÇÃO INCORRETA!!!\n\n");
                efetuarOperacao();
                break;
        }

    }
    public static void main(String[] args) {
        efetuarOperacao();
    }
}
