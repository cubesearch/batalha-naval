package TesteMatriz;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
          String[] cordenadas = {"A", "B", "C", "D", "E", "F", "G", "H"};
          String[][] matriz = new String[cordenadas.length][cordenadas.length];
          for(int colunasCordenadas = 1; colunasCordenadas < cordenadas.length+1; colunasCordenadas++){
              System.out.print("    " + colunasCordenadas);
          }
          System.out.println();
          for(int linha = 0; linha < matriz.length; linha++) {
               System.out.print(cordenadas[linha] + "  ");
               for(int coluna = 0; coluna < matriz.length; coluna++){
                   matriz[linha][coluna] = " ";
                   System.out.print("|" + matriz[linha][coluna] + "|" + "  ");
                }
               System.out.println();
        }
    }
}