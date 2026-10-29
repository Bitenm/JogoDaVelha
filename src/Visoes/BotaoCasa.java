package Visoes;

import javax.swing.*;
import java.awt.*;

public class BotaoCasa extends JButton {
    public BotaoCasa() {
        setFont(new Font("Arial", Font.BOLD, 72));
        setFocusPainted(false);

        setBackground(Color.WHITE);
        setForeground(new Color(31, 41, 55));

        setBorder(BorderFactory.createLineBorder(
                new Color(148, 163, 184), 2));
    }
}
