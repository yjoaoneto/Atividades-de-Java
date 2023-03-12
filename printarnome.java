import java.util.Scanner;

public class printarnome{
    public static void main(String[] args){

        System.out.print("Digite um nome abaixo: ");
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();

        System.out.println(nome);
        
        entrada.close();
    }
    
}