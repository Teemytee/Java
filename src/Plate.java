public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
    // Задача 2
    public boolean decreaseFood(int n){
        if (food - n < 0){
            return false;
        } else{
            food -= n;
            return true;
        }
    }
    // Задача 6
    public void fillPlate(int n){
        food += n;
    }
}
