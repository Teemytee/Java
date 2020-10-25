public class Main {

    public static void main(String[] args) {
        System.out.println("-----Задача №1-----");
        taskOne(10);
        System.out.println(" ");
        System.out.println("-----Задача №2-----");
        taskTwo();
        System.out.println(" ");
        System.out.println("-----Задача №3-----");
        taskThree();
        System.out.println(" ");
        System.out.println("-----Задача №4-----");
        taskFour();
        System.out.println(" ");
        System.out.println("-----Задача №5-----");
        taskFive(10);
        int[] masOne = new int[] {2, 2, 2, 1, 2, 2, 10, 1}; // Для теста шестого задания
        int[] masTwo = new int[] {1, 1, 1, 2, 1}; // Для теста шестого задания
        System.out.println(" ");
        System.out.println("-----Задача №6-----");
        System.out.println(taskSix(masOne));
    }

    public static void taskOne(int size){
        int[] array = new int[size];
        for (int i=0; i < array.length; i++){
            array[i] = (int) (Math.random() * 2);
        }
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            switch (array[i]){
                case 1:{
                    array[i] = 0;
                    break;
                }
                case 0:{
                    array[i] = 1;
                    break;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Новый массив:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static void taskTwo(){
        int[] array = new int[8];
        int val = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = val;
            val+= 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void taskThree(){
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(" ");
        System.out.println("Измененный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void taskFour(){
        int[][] array = new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0 ,0 }};
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Измененный массив:");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void taskFive(int size){
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(" ");
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }

    public static boolean taskSix(int[] array){
        /*
        Над этой задачей думал долго. До того как дошел до успешного решения
        было еще два варианта, думы над которыми ни к чему не привели.
        В голове вертелась идея разбить передаваемый массив на две части,
        но никак не мог вспомнить как. А потом вспомнил как делал сортировку
        слиянием на питоне и тут в голову пришла такая идея:
        1. Запускаю цикл по всей длине массива, в котором i является
        как бы *разделителем* массива на две части.
        2. В цикле есть два *подцикла*, один считает сумму чисел до текущего i,
        второй считает сумму чисел после текущего i.
        3. На каждой итерации главного цикла суммы двух частей сравниваются,
        а в конце зануляются, чтобы там не накапливалась большая мега сумма.
        4. В случае, если в пункте №3 две суммы равны друг другу, то метод
        возвращает true и заканчивает работу, если пройдя через весь массив
        суммы ни разу не были друг другу равны, то в конце работы вернет false.
         */
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        int sumLeft = 0;
        int sumRight = 0;
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                sumLeft += array[j];
            }
            for (int k = i; k < array.length; k++) {
                sumRight += array[k];

            }
            System.out.println("............");
            System.out.println("Сумма слева:" + sumLeft);
            System.out.println("Сумма справа:" + sumRight);
            if (sumLeft == sumRight){
                return true;
            }
            sumLeft = 0;
            sumRight = 0;

        }
        return false;
    }
}
