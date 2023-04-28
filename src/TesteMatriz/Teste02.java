package TesteMatriz;
import java.util.Arrays;
import java.util.Scanner;

public class Teste02 {
    //Crie uma matriz 8X8 e adicione somente seis elementos. escolha a linha e a coluna em que será armazenada os avlores na matriz
    public static void main(String[] args){
        int numLinhasColunas = 8;
        String[][] matrizChar = new String[numLinhasColunas][numLinhasColunas];
        String[] cordenadas = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for(int i = 0; i < matrizChar.length; i++){
            Arrays.fill(matrizChar[i], " ");
        }

        Scanner x = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            System.out.print("Adicione numero da linha: ");
            int linha = x.nextInt();
            System.out.print("Adicione o número da coluna: ");
            int coluna = x.nextInt();
            x.nextLine();
            System.out.print("Qual caractere deseja adicionar a posição: ");
            String c = x.nextLine();
            matrizChar[linha-1][coluna-1] = c;
        }

        for(int i = 1; i < cordenadas.length+1; i++){
            System.out.print("     " + i);
        }
        System.out.println();
        for(int i = 0; i < matrizChar.length; i++){
            System.out.print(cordenadas[i] + "  ");
            for(int j = 0; j < matrizChar[i].length; j++){
                System.out.print("| " + matrizChar[i][j] + " |" + " ");
            }
            System.out.println();
        }
    }
}
