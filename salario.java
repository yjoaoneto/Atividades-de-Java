import java.util.Scanner;

public class salario {

    public static void main(String[] args){

        System.out.print("Digite seu nome: ");
        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.nextLine();

        System.out.print("Digite quantas horas você trabalhou esse mês: ");
        float horas = entrada.nextFloat();

        System.out.print("Digite o valor de cada hora trabalhada: ");
        float valor = entrada.nextFloat();

        entrada.close();

        float salario = (horas * valor);

        System.out.print(nome +" você irá receber R$"+ salario +" de salário.");

    }
    
}
