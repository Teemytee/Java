public abstract class Animal {
    protected int runStamina;
    protected int swimStamina;
    protected double legPower;

    public Animal(int runStamina, double legPower, int swimStamina){
        this.runStamina = runStamina;
        this.swimStamina = swimStamina;
        this.legPower = legPower;

    }

    public boolean run(int distance){
        if (distance <= runStamina){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean jump(double height){
        if(height <= legPower){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean swim(int distance){
        if(distance <= swimStamina){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "runStamina=" + runStamina +
                ", swimStamina=" + swimStamina +
                ", legPower=" + legPower +
                '}';
    }
}
