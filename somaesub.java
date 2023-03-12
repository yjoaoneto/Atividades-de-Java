import java.util.Scanner;

public class somaesub {

    public static void main(String[] args){
        
        System.out.print("Digite o primeiro número: ");
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = (numero1 + numero2);
        int sub = (numero1 - numero2);

        entrada.close();

        System.out.print("A soma dos número é: "+soma);

        System.out.print("\nA subtração dos número é: "+sub);


    }
    
}
