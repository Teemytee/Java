import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Dog sharik = new Dog();
        Cat murzik = new Cat();
        testingAnimals(sharik);
        testingAnimals(murzik);
        Dog randomSharik = getRandomDog();
        Cat randomMurzik = getRandomCat();
        testingAnimals(randomSharik);
        testingAnimals(randomMurzik);


    }

    public static void testingAnimals(Animal testAnimal){

        System.out.println(testAnimal);
        System.out.println("run:" + testAnimal.run(100)); // Бегать  и кот и собака смогут
        System.out.println("swim:" + testAnimal.swim(5)); // Плавать сможет только собака
        System.out.println("jump:" + testAnimal.jump(2)); // На 2 метра прыгнуть сможет только кот
        System.out.println();
    }

    public static Dog getRandomDog(){
        Random random = new Random();
        int runStamina = random.nextInt(400);
        int swimStamina = random.nextInt(8);
        double legPower = random.nextDouble() + 1;
        return new Dog(runStamina, legPower, swimStamina);
    }

    public static Cat getRandomCat(){
        Random random = new Random();
        int runStamina = random.nextInt(400);
        int swimStamina = 0; // Кот плавать не может
        double legPower = random.nextDouble() + 1;
        return new Cat(runStamina, legPower, swimStamina);
    }
}
