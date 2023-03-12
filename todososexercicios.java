import java.util.Scanner;

public class todososexercicios {
    
    
    public static void printarnome(String[] args){
    
            System.out.print("Digite um nome abaixo: ");
            Scanner entrada = new Scanner(System.in);
    
            String nome = entrada.nextLine();
    
            System.out.println(nome);
            
            entrada.close();
        }
        
    


    

    public static void idade(String[] args){
    
            System.out.print("Digite o ano que você nasceu: ");
            Scanner entrada = new Scanner(System.in);
            int nasc = entrada.nextInt();
    
            System.out.print("\n Digite o ano atual: ");
            int atual = entrada.nextInt();
    
            int idade = (atual - nasc);
    
            System.out.println("Sua idade é: "+ idade);
            
            entrada.close();
        }
        
    
    
    

    

    public static void media(String[] args){
    
            Scanner texto = new Scanner(System.in);
    
            String nota1, nota2, nota3;
    
            System.out.print("digite sua primeira nota: ");
                nota1 = texto.nextLine();
    
            System.out.print("digite sua segunda  nota: ");
                nota2 = texto.nextLine();
    
            System.out.print("digite sua terceira nota: ");
                nota3 = texto.nextLine();
            texto.close();
    
                float n1 = Float.parseFloat(nota1);
                float n2 = Float.parseFloat(nota2);
                float n3 = Float.parseFloat(nota3);
    
            float total = ((n1 + n2 + n3)/3);
    
            System.out.printf("a media das tres notas é: "+total);
    
        }
    
    


    

    public static void somaesub(String[] args){
            
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
        
    
    


    

    public static void operacoes(String[] args){
            
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
        
    


    

        public static void pesoaltura(String[] args){
            
            System.out.print("Digite o seu peso: ");
            Scanner entrada = new Scanner(System.in);
            float peso = entrada.nextFloat();
    
            System.out.print("Digite a sua altura: ");
            float altura = entrada.nextFloat();
    
            entrada.close();
    
            System.out.print("Seu peso: "+ peso + " || Sua altura: "+ altura); 
        }
        
    


    

    public static void salario(String[] args){
    
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
        
    

    public static void Tela(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("-        Digite a atividade que deseja abaixo:        -");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>> Atividade-");
    }

    public static void main(String[] args) {
        Tela(args);
        Scanner entrada = new Scanner(System.in);

        int resposta = entrada.nextInt();
        System.out.println("+---------------+");

        switch (resposta) {

            case 1:
                printarnome(args);
                break;

            case 2:
                idade(args);
                break;

            case 3:
                media(args);
                break;
            case 4:
                somaesub(args);
                break;
            case 5:
                operacoes(args);
                break;
            case 6:
                pesoaltura(args);
                break;
            case 7:
                salario(args);

                break;
            default:
                System.out.println("ERRO TCHAU");
                entrada.close();

                break;

        }
        System.out.println("+---------------+");

        entrada.close();

    }

}
