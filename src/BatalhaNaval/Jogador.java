package BatalhaNaval;
import java.util.Arrays;
import java.util.Scanner;

public class Jogador {
    private String[] coordenadasLinhasLetras = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private char[][] meuJogo;
    private char[][] jogadaDoAdversario;
//    private int numRodadas;
    private String nomeJogador;
    static final int QTD_ARMAS_JOGADOR = 1;

    public String getNomeJogador(){
        return this.nomeJogador;
    }

    public Jogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
        this.meuJogo = new char[8][8];
        this.jogadaDoAdversario = new char[8][8];
//        this.numRodadas = 0;
    }

    public void inicializarMatrizComEspaco(){
        //"setando" os valores nulos da matriz de null para vazio
        for(int estadoValores = 0; estadoValores < meuJogo.length; estadoValores++){
            Arrays.fill(meuJogo[estadoValores], ' ');
        }
    }

    public void imprimeMatrizDoJogador() {
        //Imprimido a matriz do jogador
        System.out.println("Matriz do jogador");
        for(int i = 1; i < coordenadasLinhasLetras.length+1; i++){
            System.out.print("     " + i);
        }
        System.out.println();
        for(int linha = 0; linha < meuJogo.length; linha++){
            System.out.print(coordenadasLinhasLetras[linha] + "  ");
            for(int coluna = 0; coluna < meuJogo[linha].length; coluna++){
                System.out.print("| " + meuJogo[linha][coluna] + " |" + " ");
            }
            System.out.println();
        }
    }

    public void adicionarArmas() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < QTD_ARMAS_JOGADOR; i++){
            System.out.printf("\nAdicione sua %dª arma", i+1);
            System.out.println("\nAdicione o número da linha: ");
            int linha = scanner.nextInt();

            System.out.println("Adicione o número da coluna: ");
            int coluna = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Adicione a arma na matriz: ");
            char armaJogador = scanner.next().charAt(0);

            meuJogo[linha-1][coluna-1] = armaJogador;
            imprimeMatrizDoJogador();
        }
    }

    public void atirar(Jogador oponente, int linhaAlvo, int colunaAlvo) {
        verificarSeAcertou(oponente, linhaAlvo, colunaAlvo);
    }

    private void verificarSeAcertou(Jogador oponente, int linhaAlvo, int colunaAlvo) {
        for (int linha = 0; linha < oponente.meuJogo.length; linha++) {
            if (linhaAlvo == linha) {
                for (int coluna = 0; coluna < oponente.meuJogo[linha].length; coluna ++) {
                    if (colunaAlvo == coluna) {
                        if (colunaAlvo == 'c' || colunaAlvo == 's' || colunaAlvo == 'p') {
                            jogadaDoAdversario[linha][coluna] = '⚫';
                            System.out.println("Acertou!");
                        }
                        else {
                            jogadaDoAdversario[linha][coluna] = '✖';
                            System.out.println("Água!");
                        }
                    }
                }
            }
        }
    }

}
