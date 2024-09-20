import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        Scanner lerTeclado = new Scanner(System.in);

        int numero = numeroAleatorio.nextInt(100) + 1;
        int chancesMaximas = 10;
        int palpite = 0;
        boolean acertou = false;

        System.out.println("Bem vindo ao jogo de adivinhação!");
        System.out.println("Você tem 10 chances para adivinhar o número que eu escolhi entre 1 a 100\n");
        
        
        //palpite
        for (int chances = 1; chances <= chancesMaximas; chances++) {
            System.out.print("Escolha um número: \n");
            palpite = lerTeclado.nextInt();
        
            //dicas
            if (palpite < numero) {
                System.out.println("O número é maior\n");
            }else if ( palpite > numero){
                System.out.println("O número é menor\n");
            }else {
                acertou = true;
                System.out.println("Parabéns! Voce acertou o número " + numero + "!");
                System.out.println("tentativas: " + chances);
                break;
            }
            if (chances < chancesMaximas){
                System.out.println("voce ainda tem " + (chancesMaximas - chances) + " tentativas");
                System.out.println();
            }
        }
        
    
        if(!acertou) {
            System.out.println("Perdeu! O número era " + numero + ". Acabou suas tentativas!");
            System.out.println("tentativas: " + chancesMaximas);
        }

        lerTeclado.close();

    }
}