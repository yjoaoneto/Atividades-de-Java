import java.util.Scanner;

public class operacoes {

    public static void main(String[] args){
        
        System.out.print("Digite o primeiro número: ");
        Scanner entrada = new Scanner(System.in);

        float numero1 = entrada.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = entrada.nextFloat();

        float soma = (numero1 + numero2);
        float sub = (numero1 - numero2);
        float multi = (numero1 * numero2);
        float div = (numero1 / numero2);

        entrada.close();

        System.out.print("A soma dos número é: "+soma);

        System.out.print("\nA subtração dos número é: "+sub);

        System.out.print("\nA multiplicação dos número é: "+multi);

        System.out.print("\nA divisão dos número é: "+div);

    }
    
}