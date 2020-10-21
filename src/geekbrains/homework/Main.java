package geekbrains.homework;

public class Main {
// Задание 1 - Метод main
    public static void main(String[] args) {
        // Задание 2
        byte a = 10;
        short b = 1000;
        char c = 'c';
        int d = 10000;
        long e = 12967956785978597L;
        String word = "Apple";
        boolean p = true;
        float f = 12312.12412041f;
        double g = 123124124124513.684359684059680459;

        System.out.println("Задача 3: " + Task3(1.2f, 4.2f, 1.6f, 6.4f));
        System.out.println("Задача 4: " + Task4(10, 8));
        System.out.print("Задача 5: ");
        Task5(10);
        System.out.println("Задача 6: " + Task6(10));
        System.out.print("Задача 7: ");
        Task7("Андрей");
        System.out.println("Задача 8: " + Task8(1300));






    }
// Задание 3
    public static float Task3(float a,
                              float b,
                              float c,
                              float d){
        return (a * (b + (c/d)));

    }
// Задание 4
    public static boolean Task4(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }
// Задание 5
    public static void Task5(int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }
// Задание 6
    public static boolean Task6(int a){
        return a < 0;
    }
// Задание 7
    public static void Task7(String a){
        System.out.println("Привет, " + a);
    }
// Задание 8
    public static boolean Task8(int a) { return (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);}

}
