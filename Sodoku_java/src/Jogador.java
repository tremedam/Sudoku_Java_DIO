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
        return Integer.parseInt(obterTexto("Digite a linha (0-8)", "[0-8]"));
    }

    public int obterColuna() {
        return Integer.parseInt(obterTexto("Digite a linha (0-8)", "[0-8]"));
    }

    public int obterValor() {
        return Integer.parseInt(obterTexto("Digite o valor (1-9)", "[0-9]"));
    }
    
    private String obterTexto(String titulo, String regex) {
    	
    	int count = 0;
    	
    	String valor = "";
    	
    	do {
    		
    		System.out.print(titulo + ": ");
    		
    		valor = scanner.next();
    		
    		if(valor != null && valor.matches(regex)) {
    			return valor;
    		}
    		System.out.println("Valor digitado inválido.");
		} while (count++ < 10);
    	
    	System.out.println();
    	System.out.println("Ta de sacanagem.");
    	System.out.println("Encerrando aplicação.");
    	System.exit(0);
    	return valor;
    }
}