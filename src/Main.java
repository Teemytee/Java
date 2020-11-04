import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] field = createField();
        startGame(field);
    }

    static void startGame(char[][] field){
        drawField(field);
        do{
            doPlayerMove(field);
            if (checkWinNew(field, 'X')){
                drawField(field);
                System.out.println("Победил игрок");
                break;
            }
            if (checkDraw(field)){
                drawField(field);
                System.out.println("Ничья");
                break;
            }
            doPlayerAI(field);
            if (checkWinNew(field, 'O')){
                drawField(field);
                System.out.println("Победил компьютер");
                break;
            }
            if (checkDraw(field)){
                drawField(field);
                System.out.println("Ничья");
                break;
            }
            drawField(field);
        } while(true);
    }

    static char[][] createField(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какого размера поле Вы хотите? (Введите одну цифру)");
        int size = scanner.nextInt();
        System.out.println("Какой стиль незаполненных ячеек вы предпочитаете?");
        char letter = scanner.next().charAt(0);
        return createFieldByNumber(size, letter);
    }



    static boolean checkDraw(char[][] field){
        int maxMinus = field.length * field.length;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-'){
                    maxMinus--;
                }
            }
            
        }
        return maxMinus == 0;
    }

    static boolean checkWinNew(char[][] field, char sign){

        /*
        Суть такова: анализируем строку (столбец, диагональ или обратную диагональ),
        если элемент строки соответствует нужному знаку, то переменная счетчик
        увеличивается на 1. В конце анализа строки сравниваем значение счетчика
        с максимальным значением строки (ну или опять же столбца), если
        счетчик равен длине строки (то есть все элементы строки являются
        нужным знаком), то вовзращаем true, то есть победа.
         */
        // Строка
        int counter;
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == sign){
                    counter++;
                }
            }
            if (counter == field.length){
                return true;
            }

        }

        // Столбец
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == sign){
                    counter++;
                }
            }
            if (counter == field.length){
                return true;
            }

        }

        // Диагональ
        counter = 0;
        for (int i = 0; i < field.length; i++) {

            if (field[i][i] == sign){
                counter++;
            }

            if (counter == field.length){
                return true;
            }

        }

        // Обратная диагональ
        counter = 0;
        int maxLength = field.length-1;
        for (int i = 0; i < field.length; i++) {

            if (field[i][maxLength] == sign){
                counter++;
            }
            maxLength--;

            if (counter == field.length){
                return true;
            }

        }
        return false;
    }


    static void doPlayerAI(char[][] field){
        Random random = new Random();
        int x,y;
        do{
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static void doPlayerMove(char[][] field){
        int x,y;
        do{
            x = setIndexCoordinate('X', field.length);
            y = setIndexCoordinate('Y', field.length);

        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static int setIndexCoordinate(char coordName, int max){
        return setCoordinate(coordName, max) - 1;
    }
    static int setCoordinate(char coordName, int max){
        int coord;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("Пожалуйста, введите координату %s [1-%s]:", coordName, max));
            coord = scanner.nextInt();
        }while (coord < 1 || coord > max);
        return coord;
    }

    static void drawField(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
    static char[][] createFieldByNumber(int a, char letter){
        char[][] array = new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = letter;
            }
        }
        return array;
    }
}
