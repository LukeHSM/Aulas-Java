// Calcular o valor do salário líquido, após descontos e benefícios.
/*
 * imposto = 
 * (até R$1100.00, imposto 5.00%)
 * (de R$1100.00 a R$2500.00, imposto 10.00%)
 * (mais de R$2500.00, imposto 15.00%)
*/

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        calcularSalarioLiquido();
    }
        
    static void calcularSalarioLiquido (){
        Scanner read = new Scanner(System.in);
        System.out.printf("Digite o valor da salário bruto: ");
        double salarioBruto = read.nextDouble();
        System.out.printf("%nDigite o valor total dos benefícios: ");
        double beneficios = read.nextDouble();
        double salarioLiquido;
        

        if (salarioBruto>2500.00) {
            salarioLiquido = (salarioBruto - (salarioBruto*0.15)) + beneficios;
        }else if (salarioBruto<=2500.00 && salarioBruto>=1100.00) {
            salarioLiquido = (salarioBruto - (salarioBruto*0.10)) + beneficios;
        }else{
            salarioLiquido = (salarioBruto - (salarioBruto*0.05)) + beneficios;
        }

        System.out.printf("Salário bruto: R&%.2f%nBenefícios: R$%.2f%nSalário líquido: R$%.2f", salarioBruto, beneficios, salarioLiquido);
    }

}

