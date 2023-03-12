import java.util.Scanner;

public class idade {

    public static void main(String[] args){

        System.out.print("Digite o ano que você nasceu: ");
        Scanner entrada = new Scanner(System.in);
        int nasc = entrada.nextInt();

        System.out.print("\n Digite o ano atual: ");
        int atual = entrada.nextInt();

        int idade = (atual - nasc);

        System.out.println("Sua idade é: "+ idade);
        
        entrada.close();
    }
    
}
