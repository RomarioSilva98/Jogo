import java.util.Scanner;
import java.util.Random;
public class Jogo {
    public static void main (String []args ){
        Random random = new Random ();
        Scanner sc = new Scanner(System.in);

        int tent=10;
        int NumAle = random.nextInt(100);

        for (int i=1; 1<=10; i++) {
            System.out.println ("Tente adivinhar o número");
            System.out.println ("Você tem "+tent+ " Tentativas ");
            int numero = sc.nextInt ();
            tent -=1;
            if (numero > NumAle) {
                System.out.println ("O número que você digitou é maior que a resposta");

            }else if (numero < NumAle){
                System.out.println ("O número que você digitou é menor que a resposta");

            }else{
                System.out.println ("Parabéns você acertou o número era "+NumAle);
                break;
            }
            System.out.println ("__________________________________________________");
        }
    }
}