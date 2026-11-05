package Classes;

public class EventoJogo {
    private final int linha;
    private final int coluna;
    private final Simbolo simbolo;
    private final Jogador jogadorAtual;
    private final EstadoDaPartida estadoDaPartida;
    private final TipoEventoJogo tipoEventoJogo;

    public EventoJogo(int linha, int coluna, Simbolo simbolo, Jogador jogadorAtual, EstadoDaPartida estadoDaPartida, TipoEventoJogo tipoEventoJogo) {
        this.linha = linha;
        this.coluna = coluna;
        this.simbolo = simbolo;
        this.jogadorAtual = jogadorAtual;
        this.estadoDaPartida = estadoDaPartida;
        this.tipoEventoJogo = tipoEventoJogo;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public EstadoDaPartida getEstadoDaPartida() {
        return estadoDaPartida;
    }

    public TipoEventoJogo getTipoEventoJogo() {
        return tipoEventoJogo;
    }
}
