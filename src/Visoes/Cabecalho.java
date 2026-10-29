package Visoes;

import javax.swing.*;
import java.awt.*;

public class Cabecalho extends JPanel {
    public Cabecalho() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        setPreferredSize(new Dimension(0, 80));


        JLabel titulo = new JLabel("Jogo da Velha");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        add(titulo);
    }
}
