import java.util.Random;
import java.util.Vector;

public class World {
    private int x;
    private int y;
    private int roundCounter;
    private boolean game;
    private Organism[][] array;

    public World(int x, int y, int roundCounter, Organism[][] array) {
        this.x = x;
        this.y = y;
        this.roundCounter = roundCounter;
        this.array = array;
        // random organism
        //coordinate tmp =null;
        RandomPlace(new Human(5, 1, 4, this, null, false, 5));
        for (int i = 0; i < 2; i++) {
            RandomPlace(new Antylopa(4, 1, 4, this, null));
            RandomPlace(new Wilk(9, 1, 5, this, null));
            RandomPlace(new Owca(4, 1, 4, this, null));
            RandomPlace(new Zolw(2, 1, 1, this, null));
            RandomPlace(new Lis(3, 1, 7, this, null));
            RandomPlace(new BarszczSosnowskiego(10, 1, 0, this, null));
            RandomPlace(new WilczeJagody(99, 1, 0, this, null));
            RandomPlace(new Mlecz(0, 1, 0, this, null));
            RandomPlace(new Trawa(0, 1, 0, this, null));
            RandomPlace(new Guarana(0, 1, 0, this, null));
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }

    public boolean isGame() {
        return game;
    }

    public void setGame(boolean game) {
        this.game = game;
    }

    public Organism getOrganismFromArray(int x, int y) {
        if (x < 1 || x > this.x || y < 1 || y > this.y) {
            return null;
        } else {
            return array[x - 1][y - 1];
        }
    }

    public void setOrganismOnArray(Organism org, int x, int y) {
        this.array[x - 1][y - 1] = org;
    }

    public void RandomPlace(Organism org) {
        coordinate newPosition = null;
        while (true) {
            Random rand = new Random();
            newPosition.setX(rand.nextInt(20) + 1);
            newPosition.setY(rand.nextInt(20) + 1);
            if (getOrganismFromArray(newPosition.getX(), newPosition.getY()) == null) {
                setOrganismOnArray(org, newPosition.getX(), newPosition.getY());
                org.setPosition(newPosition);
                break;
            }

        }
    }

    public void Round() {
        Vector<Organism> move = new Vector<Organism>();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                Organism org = null;
                org = getOrganismFromArray(i, j);
                if (org != null) {
                    move.add(org);
                }
            }
        }
        while (move.isEmpty()) {
            Organism org = move.lastElement();
            if (org.getAge() != -1) {
                org.Action();
            }
            //delete
            move.remove(move.size() - 1);


        }
    }
}


