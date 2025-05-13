# Jogo de Sudoku em Java

Este projeto é um jogo de Sudoku interativo desenvolvido em Java. O jogo é executado no terminal e permite que os jogadores resolvam um tabuleiro de Sudoku, interagindo através de entradas de texto.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

```
sudoku-jogo
├── src
│   ├── Main.java          
│   ├── JogoSudoku.java    
│   ├── Tabuleiro.java      
│   ├── Jogador.java        
│   └── util
│       └── Entrada.java    
```

## Como Compilar e Executar

Para compilar e executar o jogo, siga os passos abaixo:

1. **Certifique-se de ter o Java instalado**: Verifique se você possui o JDK instalado em sua máquina. Você pode baixar a versão mais recente do JDK no site oficial da Oracle.

2. **Compile o código**: Navegue até o diretório `src` e execute o seguinte comando no terminal:
   ```
   javac *.java util/*.java
   ```

3. **Execute o jogo**: Após a compilação, execute o jogo com o comando:
   ```
   java Main
   ```

## Funcionalidades

- Inicialização do tabuleiro de Sudoku com números pré-definidos.
- Validação de jogadas para garantir que as regras do Sudoku sejam seguidas.
- Interação com o jogador através do terminal, permitindo que ele insira suas jogadas.
- Exibição do estado atual do tabuleiro após cada jogada.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou correções. Para isso, você pode fazer um fork do repositório e enviar um pull request com suas alterações.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.