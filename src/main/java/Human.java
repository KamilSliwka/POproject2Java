public class Human extends Animal {
    public Human(int force, int age, int initiative, World currentWorld, coordinate position) {
        super(force, age, initiative, currentWorld, position);
    }

    @Override
    public void Action() {
        super.Action();
    }

    @Override
    public String GetName() {
        return null;
    }

    @Override
    public void PrintOrganism() {

    }

    @Override
    public Organism Multiplication(coordinate pos) {
        return null;
    }

    @Override
    public coordinate Move() {
        return super.Move();
    }
}
