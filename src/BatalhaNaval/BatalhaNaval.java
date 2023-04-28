package BatalhaNaval;
import java.util.Scanner;
public class BatalhaNaval {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //dados jogador 1
        System.out.print("Informe o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        Jogador jogador1 = new Jogador(nomeJogador1);
        jogador1.inicializarMatrizComEspaco();
        jogador1.imprimeMatrizDoJogador();
        jogador1.adicionarArmas();
        jogador1.imprimeMatrizDoJogador();

        //dados jogador 2
        System.out.print("Informe o nome do jogador 1: ");
        String nomeJogador2 = scanner.nextLine();

        Jogador jogador2 = new Jogador(nomeJogador2);
        jogador2.inicializarMatrizComEspaco();
        jogador2.imprimeMatrizDoJogador();
        jogador2.adicionarArmas();
        jogador2.imprimeMatrizDoJogador();

        //tiros do jogador1
        System.out.println("Jogador 1... Dispare!");

    }
}
