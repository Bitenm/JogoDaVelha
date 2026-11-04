package Visoes;

import Classes.Jogador;
import Classes.Jogo;
import Classes.Simbolo;

public class Aplicacao {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(Simbolo.X, "Gabriel");
        Jogador jogador2 = new Jogador(Simbolo.O, "Isa");
        Jogo novoJogo = new Jogo(jogador1, jogador2);
        new TelaPrincipal(novoJogo);


    }
}
