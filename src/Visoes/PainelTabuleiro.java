package Visoes;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
    public PainelTabuleiro() {
        setLayout(new GridLayout(3, 3, 4, 4));
        setBackground(new Color(203, 213, 225));

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                add(new BotaoCasa());
            }
        }
    }
}
