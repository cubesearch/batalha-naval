package BatalhaNaval;
import java.util.Scanner;
public class BatalhaNaval {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Boolean jogoAcabou = false;

        //dados jogador 1
        System.out.print("Informe o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        Jogador jogador1 = new Jogador(nomeJogador1);
        jogador1.inicializarMatrizesComEspaco();
        System.out.println("\nMatriz do jogador 1:");
        jogador1.imprimeMatrizDoJogador();
        jogador1.adicionarArmas();

        //dados jogador 2
        System.out.print("\nInforme o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        Jogador jogador2 = new Jogador(nomeJogador2);
        jogador2.inicializarMatrizesComEspaco();
        System.out.println("\nMatriz do jogador 2:");
        jogador2.imprimeMatrizDoJogador();
        jogador2.adicionarArmas();

        while (!jogoAcabou) {
            //jogada jogador 1
            for (int i = 0; i < 2; i++) {
                System.out.println("\nJogador 1... Dispare!");
                System.out.println("Jogador 1, digite a linha do disparo: ");
                int linhaJog1PrimeiraJogada = scanner.nextInt();

                System.out.println("Jogador 1, digite a coluna do disparo: ");
                int colunaJog1SegundaJogada = scanner.nextInt();

                jogador1.atirar(jogador2, linhaJog1PrimeiraJogada, colunaJog1SegundaJogada);
                jogador1.imprimeJogoDoAdversario();
                if(jogador1.verificarSeAcabou()) {
                    jogoAcabou = true;
                    break;
                };
            }

            //jogada jogador 2
            if (!jogoAcabou) {
                for (int i = 0; i < 2; i++) {
                    System.out.println("\nJogador 2... Dispare!");
                    System.out.println("Jogador 2, digite a linha do disparo: ");
                    int linhaJog2PrimeiraJogada = scanner.nextInt();

                    System.out.println("Jogador 2, digite a coluna do disparo: ");
                    int colunaJog2SegundaJogada = scanner.nextInt();

                    jogador2.atirar(jogador1, linhaJog2PrimeiraJogada, colunaJog2SegundaJogada);
                    jogador2.imprimeJogoDoAdversario();
                    if(jogador2.verificarSeAcabou()) {
                        jogoAcabou = true;
                        break;
                    };
                }
            }
        }

    }
}
