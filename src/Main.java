import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10); // Тут хранится загаданное число
        System.out.println("Угадайте число в диапазоне 0 - 9");
        int life = 3;
        int answer, start;
        while (life > 0){
            answer = scanner.nextInt();
            if (answer == number){
                System.out.println("Вы угадали!");
                life = -1;
            } else if(answer > number){
                System.out.println("Загаданное число меньше");
                life -= 1;
            } else if (answer < number) {
                System.out.println("Загаданное число больше");
                life -=1;
            }
        }
        if(life == 0){
            System.out.println("Попытки кончились");
        }
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        start = scanner.nextInt();
        if (start == 1){
            taskOne();
        }
    }




    public static void taskTwo(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                         "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                         "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                         "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(words.length);
        String randomWord = words[number]; // Тут хранится загаданное слово
        System.out.println("Угадайте слово");
        //System.out.println(randomWord);
        boolean game = true;

        while (game){
            String answer = scanner.next();
            if (answer.equals(randomWord)){
                System.out.println("Вы угадали");
                game = false;
            } else {
                System.out.println("Вы не угадали");
                for (int i = 0; i < Math.min(randomWord.length(), answer.length()); i++) {
                    if (answer.charAt(i) == randomWord.charAt(i)){
                        System.out.print(randomWord.charAt(i));
                    }
                    else{
                        if (answer.charAt(i) != randomWord.charAt(i)){
                            System.out.print('#');
                        }
                    }

                }
                for (int i = answer.length(); i < 15; i++) {
                    System.out.print('#');

                }
            }
            System.out.println(' ');
        }
    }
}
