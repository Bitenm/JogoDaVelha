package Classes;

import java.util.ArrayList;

public class Jogo {
    Tabuleiro tabuleiro = new Tabuleiro();
    Jogador jogador1;
    Jogador jogador2;
    ArrayList<jogoObservador> observadores = new ArrayList<>();
    EstadoDaPartida estado;

    Jogador jogadorAtual;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadorAtual = jogador1;
        estado = EstadoDaPartida.EM_ANDAMENTO;
    }

    public void registrarObservador(jogoObservador observador){
        observadores.add(observador);
    }

    public void notificarObservador(EventoJogo eventoJogo){
        observadores.forEach(observador -> observador.jogadaRealizada(eventoJogo));
    }


    public void Jogada(int Linha , int Coluna){

        if(estado != EstadoDaPartida.EMPATE && estado != EstadoDaPartida.VITORIA){
            Simbolo simboloDaJogada = jogadorAtual.getSimbolo();
            if(tabuleiro.marcar(Linha, Coluna, simboloDaJogada)){

                if (tabuleiro.verificarVitoria() != Simbolo.VAZIO){
                    System.out.println("Jogo finalizado");
                    System.out.println(jogadorAtual.getNome() + " venceu a partida");
                    estado = EstadoDaPartida.VITORIA;
                } else if (tabuleiro.verificarEmpate()) {
                    System.out.println("Jogo Empatado");
                    estado = EstadoDaPartida.EMPATE;
                } else {
                    if(jogadorAtual == jogador1){
                        jogadorAtual = jogador2;
                    }else{
                        jogadorAtual = jogador1;
                    }
                }

                notificarObservador(new EventoJogo(Linha, Coluna, simboloDaJogada, jogadorAtual, estado , TipoEventoJogo.JOGADA));

            } else{
                System.out.println("Jogada Indevida");
            }
        }
    };

    public void reiniciar(){
        tabuleiro.reiniciar();
        jogadorAtual = jogador1;
        estado = EstadoDaPartida.EM_ANDAMENTO;
        System.out.println("Jogo reiniciado");

        notificarObservador(new EventoJogo(-1 , -1 , Simbolo.VAZIO, jogadorAtual, estado , TipoEventoJogo.REINICIO));

    }



}
