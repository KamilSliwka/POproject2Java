import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMove extends JFrame implements KeyListener {
    private Organism human;

    public KeyMove(Organism hum) {
        addKeyListener(this);
        setVisible(true);
        this.human = hum;
    }

    public Organism getHuman() {
        return human;
    }

    public void setHuman(Organism human) {
        this.human = human;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        coordinate c = human.getPosition();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                if (c.getX() != 1) {
                    c.setX(c.getX() - 1);
                    human.setPosition(c);
                }
                // kod do obsługi klawisza W

                break;
            case KeyEvent.VK_A:
                if (c.getY() != 1) {
                    c.setX(c.getY() - 1);
                    human.setPosition(c);
                }
                // kod do obsługi klawisza A
                break;
            case KeyEvent.VK_S:
                if (c.getX() != 20) {
                    c.setX(c.getX() + 1);
                    human.setPosition(c);
                }
                // kod do obsługi klawisza S
                break;
            case KeyEvent.VK_D:
                if (c.getY() != 20) {
                    c.setX(c.getY() + 1);
                    human.setPosition(c);
                }
                // kod do obsługi klawisza D
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // nic nie robimy
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // nic nie robimy
    }

}
