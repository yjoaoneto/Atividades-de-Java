import java.util.Scanner;

public class pesoaltura {

    public static void main(String[] args){
        
        System.out.print("Digite o seu peso: ");
        Scanner entrada = new Scanner(System.in);
        float peso = entrada.nextFloat();

        System.out.print("Digite a sua altura: ");
        float altura = entrada.nextFloat();

        entrada.close();

        System.out.print("Seu peso: "+ peso + " || Sua altura: "+ altura); 
    }
    
}
