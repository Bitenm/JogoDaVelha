package Classes;

public class Jogador {
    private final Simbolo simbolo;
    private final String nome;

    public Jogador(Simbolo simbolo, String nome) {
        this.simbolo = simbolo;
        this.nome = nome;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public String getNome() {
        return nome;
    }
}
