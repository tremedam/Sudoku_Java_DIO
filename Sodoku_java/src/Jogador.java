import java.util.Scanner;

public class Jogador {
    private final String nome;
    private final int[][] jogadas;
    private static final Scanner scanner = new Scanner(System.in);

    public Jogador(String nome) {
        this.nome = nome;
        this.jogadas = new int[9][9]; // Inicializa um tabuleiro vazio para as jogadas
    }

    public String getNome() {
        return nome;
    }

    public void fazerJogada(int linha, int coluna, int valor) {
        if (linha >= 0 && linha < 9 && coluna >= 0 && coluna < 9) {
            jogadas[linha][coluna] = valor;
        }
    }

    public int[][] getJogadas() {
        return jogadas;
    }

    public void mostrarJogadas() {
        for (int[] linha : jogadas) {
        for (int valor : linha) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
    }

    public int obterLinha() {
        System.out.print("Digite a linha (0-8): ");
        return scanner.nextInt();
    }

    public int obterColuna() {
        System.out.print("Digite a coluna (0-8): ");
        return scanner.nextInt();
    }

    public int obterValor() {
        System.out.print("Digite o valor (1-9): ");
        return scanner.nextInt();
    }
}