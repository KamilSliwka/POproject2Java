public abstract class Animal extends Organism {

    public Animal(int force, int age, int initiative, World currentWorld, coordinate position) {
        super(force, age, initiative, currentWorld, position);
    }

    @Override
    public void Action() {
        setAge(getAge() + 1);
        coordinate newPosition;
        newPosition = Move();
        if (getCurrentWorld().getOrganismFromArray(newPosition.getX(), newPosition.getY()) == null) {
            getCurrentWorld().setOrganismOnArray(this, newPosition.getX(), newPosition.getY());
            getCurrentWorld().setOrganismOnArray(null, getPosition().getX(), getPosition().getY());
            setPosition(newPosition);
        } else {
            if (!(newPosition.equals(getPosition())))
                Collision(newPosition);
        }
    }

    @Override
    public void Collision(coordinate pos) {
///
    }

    public String GetName(Organism org) {
        return org.GetName();
    }

    public boolean ifTheSameOrganism(Organism org) {
        if (GetName().equals(GetName(org))) {
            return true;
        } else {
            return false;
        }
    }

    public void Birth() {
        coordinate newPosition;
        newPosition = FindFreeField();
        if (newPosition.getX() == -1 && newPosition.getY() == -1) {
            //nie ma narodzin
            return;
        }
        Multiplication(newPosition);
    }


}
