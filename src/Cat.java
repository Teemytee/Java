public class Cat {
    private String name;
    private int appetite;
    private boolean fed;
    public Cat(String name, int appetite){
        this.fed = false;
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p){
        // Задача 3 и 4
        if (p.decreaseFood(appetite)){
            fed = true;
            System.out.println(String.format("Коту %s покушать удалось", name));
        } else{
            System.out.println(String.format("Коту %s покушать не удалось", name));
        }
    }
}
