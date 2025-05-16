import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float n1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = entrada.nextFloat();

        System.out.println("Digite o tipo de calculo que você quer fazer");
        String sinal = entrada.next();

        switch(sinal){
            case "+":
                System.out.println("A soma é: " + (n1 + n2));
                break;
            case "-":
                System.out.println("A subtração é: " + (n1 - n2));
                break;
            case "*":
                System.out.println("A multiplicação é: " + (n1 * n2));
                break;
            case "/":
                System.out.println("A divisão é: " + (n1 / n2));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
