package Lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Map extends JPanel {
    private static final int WIN_HEIGHT = 100 ;
    private static final int WIN_WIDTH = 400;
    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;


    int mode;
    int fieldSizeX;
    int fieldSizeY;
    int winLength;

    int cellWidth;
    int cellHeight;


    boolean isInitialised = false;

    private BufferedImage x;
    private BufferedImage o;
    private BufferedImage gameOver;
    private BufferedImage victory;
    private BufferedImage draw;


    public Map() {
        setBackground(Color.ORANGE);
        try {
            x = ImageIO.read(Map.class.getResourceAsStream("x.png"));
            o = ImageIO.read(Map.class.getResourceAsStream("o.png"));
            gameOver = ImageIO.read(Map.class.getResourceAsStream("gameOver.png"));
            victory = ImageIO.read(Map.class.getResourceAsStream("victory.png"));
            draw = ImageIO.read(Map.class.getResourceAsStream("draw.png"));


        } catch (IOException ex) {}

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winLength);
        this.mode = mode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLength = winLength;

        isInitialised = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInitialised) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[j][i] == Logic.DOT_X) {
                    g.drawImage(x, i * cellWidth, j * cellHeight, cellWidth, cellHeight, this);

                }
                if (Logic.map[j][i] == Logic.DOT_O) {
                    g.drawImage(o, i * cellWidth, j * cellHeight, cellWidth, cellHeight, this);
                }

            }
        }

        Logic logic = new Logic();
        if (logic.checkWin(logic.DOT_O)){
            g.drawImage(gameOver, 35,150,WIN_WIDTH , WIN_HEIGHT, this);
        }
        if (logic.isFull()) {
            g.drawImage(draw,50,160, WIN_WIDTH , WIN_HEIGHT, this);
        }

        if (logic.checkWin(logic.DOT_X)){
            g.drawImage(victory,35,150, WIN_WIDTH , WIN_HEIGHT, this);
        }

    }

    void update(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        System.out.println(cellX + " " + cellY);

        Logic.humanTurn(cellX, cellY);
        repaint();
    }
}
