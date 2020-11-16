public class Main {

    public static void main(String[] args) {
        // Задача 5
        catsEats();
    }

    public static void catsEats(){
        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 15),
                new Cat("Bazilio", 25),
        };
        Plate tarelka = new Plate(40);
        for (Cat c: cats){
            c.eat(tarelka);
        }
    }
}
