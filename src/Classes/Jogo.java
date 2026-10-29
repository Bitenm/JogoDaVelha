package Classes;

public class Jogo {
    Tabuleiro tabuleiro = new Tabuleiro();
    Jogador jogador1;
    Jogador jogador2;
    boolean jogoFinalizado = false;

    Jogador jogadorAtual;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadorAtual = jogador1;

    }

    public void Jogada(int Linha , int Coluna){

        if(!jogoFinalizado){
            if(tabuleiro.marcar(Linha, Coluna, jogadorAtual.getSimbolo())){

                if (tabuleiro.verificarVitoria() != Simbolo.VAZIO){
                    System.out.println("Jogo finalizado");
                    System.out.println(jogadorAtual.getNome() + " venceu a partida");
                    jogoFinalizado = true;
                } else if (tabuleiro.verificarEmpate()) {
                    System.out.println("Jogo Empatado");
                    jogoFinalizado = true;
                } else {
                    if(jogadorAtual == jogador1){
                        jogadorAtual = jogador2;
                    }else{
                        jogadorAtual = jogador1;
                    }
                }
            } else{
                System.out.println("Jogada Indevida");
            }
        }
    };

    public void reiniciar(){
        tabuleiro.reiniciar();
        jogadorAtual = jogador1;
        jogoFinalizado = false;
        System.out.println("Jogo reiniciado");
    }



}
