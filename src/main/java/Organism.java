public abstract class Organism {
    private int force;
    private int age;
    private int initiative;
    private World currentWorld;
    private coordinate position;

    public Organism(int force, int age, int initiative, World currentWorld, coordinate position) {
        this.force = force;
        this.age = age;
        this.initiative = initiative;
        this.currentWorld = currentWorld;
        this.position = position;
    }

    public abstract String GetName();
    public abstract void  Action();
    public abstract void  Collision();
    public abstract void  PrintOrganism();
    public abstract void  Multiplication();

    public boolean GetSpecialAbility(){
        return false;
    }

    public int GetCounterAbility(){
        return 0;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public World getCurrentWorld() {
        return currentWorld;
    }

    public void setCurrentWorld(World currentWorld) {
        this.currentWorld = currentWorld;
    }

    public coordinate getPosition() {
        return position;
    }

    public void setPosition(coordinate position) {
        this.position = position;
    }
}
