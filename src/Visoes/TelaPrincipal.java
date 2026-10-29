package Visoes;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        Cabecalho cabecalho = new Cabecalho();
        add(cabecalho, BorderLayout.NORTH);

        PainelTabuleiro painelTabuleiro = new PainelTabuleiro();
        add(painelTabuleiro, BorderLayout.CENTER);

        setVisible(true);

    }
}
