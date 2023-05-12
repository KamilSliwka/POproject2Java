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
}
