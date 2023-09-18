import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();


        sc.close();

        double soma= numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double modulo = numero1 % numero2;


        System.out.println("A soma é igual a: " + soma);
        System.out.println("A subtracao é igual a: " + subtracao);
        System.out.println(" A multiplicacao é igual a: " + multiplicacao);
        System.out.println("teste");




    }
    
}
