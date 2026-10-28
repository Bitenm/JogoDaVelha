package Classes;

public class Jogo {
    Tabuleiro tabuleiro = new Tabuleiro();
    Jogador jogador1;
    Jogador jogador2;

    Jogador jogadorAtual;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadorAtual = jogador1;

    }

    public void Jogada(int Linha , int Coluna){

        if(tabuleiro.marcar(Linha, Coluna, jogadorAtual.getSimbolo())){
            if(jogadorAtual == jogador1){
                jogadorAtual = jogador2;
            }else{
                jogadorAtual = jogador1;
            }

            // se retornar algo diferente de vazio aqui eh porque tivemos um vencedor
            if (tabuleiro.verificarVitoria() != Simbolo.VAZIO){
                System.out.println("Jogo finalizado");
                System.out.println(tabuleiro.verificarVitoria());
            }
        }
    };



}
