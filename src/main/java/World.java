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

    public Organism getOrganismFromArray(int x,int y) {
        if (x < 1 || x > this.x || y < 1 || y > this.y) {
            return null;
        } else {
            return array[x - 1][y - 1];
        }
    }

    public void setOrganismOnArray(Organism org,int x,int y) {
        this.array[x - 1][y - 1] = org;
    }
}
