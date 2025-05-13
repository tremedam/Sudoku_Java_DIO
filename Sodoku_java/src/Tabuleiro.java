public class Tabuleiro {
    private final  int[][] tabuleiro;
    private static final int TAMANHO = 9;

    public Tabuleiro() {
        tabuleiro = new int[TAMANHO][TAMANHO];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        // Lógica para inicializar o tabuleiro com valores padrão ou um tabuleiro pré-definido
    }

    public void exibirTabuleiro() {
        System.out.println("   0 1 2   3 4 5   6 7 8");
    for (int i = 0; i < 9; i++) {
        if (i % 3 == 0) {
            System.out.println("  +------+------+------+");
        }
        System.out.print(i + " |");
        for (int j = 0; j < 9; j++) {
            if (tabuleiro[i][j] == 0) {
                System.out.print("  ");
            } else {
                System.out.print(tabuleiro[i][j] + " ");
            }
            if ((j + 1) % 3 == 0) {
                System.out.print("|");
            }
        }
        System.out.println();
    }
    System.out.println("  +------+------+------+");
    }

    public boolean verificarCompleto() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (tabuleiro[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validarJogada(int linha, int coluna, int valor) {
        // Lógica para validar se a jogada é válida
        return true; // Retornar verdadeiro ou falso com base na validação
    }

    public void fazerJogada(int linha, int coluna, int valor) {
        if (validarJogada(linha, coluna, valor)) {
            tabuleiro[linha][coluna] = valor;
        }
    }
}