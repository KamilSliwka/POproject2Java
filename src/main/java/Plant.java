public abstract class Plant extends Organism {

    public Plant(int force, int age, int initiative, World currentWorld, coordinate position) {
        super(force, age, initiative, currentWorld, position);
    }

    @Override
    public void Action() {
        setAge(getAge() + 1);
        boolean spread = RandomProbability(10);
        if (spread) {
            coordinate newPosition = FindFreeField();
            if (newPosition.getX() != -1 && newPosition.getY() != -1) {
                return;
            } else {
                Multiplication(newPosition);
            }
        }
    }

    @Override
    public void Collision(coordinate pos) {
        return;
    }

    public boolean ifPlant(Organism org) {
        if (org instanceof Mlecz) {
            return true;
        } else if (org instanceof Trawa) {
            return true;
        } else if (org instanceof Guarana) {
            return true;
        } else if (org instanceof WilczeJagody) {
            return true;
        } else if (org instanceof BarszczSosnowskiego) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ifHuman(Organism org) {
        if (org instanceof Human) {
            return true;
        } else {
            return false;
        }
    }
}
