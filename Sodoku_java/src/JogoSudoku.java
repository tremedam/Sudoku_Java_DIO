public class JogoSudoku {
    private final Tabuleiro tabuleiro;
    private final Jogador jogador;
    private boolean jogoAtivo;

    public JogoSudoku() {
        this.tabuleiro = new Tabuleiro();
        this.jogador = new Jogador("Jogador 1");
        this.jogoAtivo = true;
    }

    public void iniciarJogo() {
        tabuleiro.exibirTabuleiro();
        while (jogoAtivo) {
            tabuleiro.exibirTabuleiro();
            realizarJogada();
            verificarEstadoJogo();
        }
    }

    private void realizarJogada() {
        int linha = jogador.obterLinha();
        int coluna = jogador.obterColuna();
        int valor = jogador.obterValor();

        if (tabuleiro.validarJogada(linha, coluna, valor)) {
            tabuleiro.fazerJogada(linha, coluna, valor);
        } else {
            System.out.println("Movimento inválido. Tente novamente.");
        }
    }

    private void verificarEstadoJogo() {
        if (tabuleiro.verificarCompleto()) {
            System.out.println("Parabéns! Você completou o Sudoku!");
            jogoAtivo = false;
        }
    }
}