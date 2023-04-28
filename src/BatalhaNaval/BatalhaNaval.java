package BatalhaNaval;
import java.util.Scanner;
public class BatalhaNaval {
    public static void main(String[] args){
        Scanner nomeJogador1 = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String jogador1 = nomeJogador1.nextLine();
        Jogador jogador = new Jogador(jogador1);
        jogador.adicionarArmasTabuleiro();
    }
}
