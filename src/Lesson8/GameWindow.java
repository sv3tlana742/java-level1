package Lesson8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WIN_HEIGHT = 500;
    private static final int WIN_WIDTH = 505;
    private static final int WIN_POS_X = 350;
    private static final int WIN_POS_Y = 150;

    private static StartNewGameWindow startNewGameWindow;
    private static Map field;

    public GameWindow() {
        setBounds(WIN_POS_X, WIN_POS_Y, WIN_WIDTH, WIN_HEIGHT);
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Start new Game");
        JButton btnExit = new JButton("Exit");
        jPanel.add(btnNewGame);
        jPanel.add(btnExit);
        add(jPanel, BorderLayout.SOUTH);

        startNewGameWindow = new StartNewGameWindow(this);

        btnNewGame.addActionListener(event -> {
            startNewGameWindow.setVisible(true);
        });

        btnExit.addActionListener(event -> {
            System.exit(0);
        });

        field = new Map();
        add(field, BorderLayout.CENTER);
        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        field.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }

}
