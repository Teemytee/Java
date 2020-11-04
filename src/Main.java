public class Main {

    public static void main(String[] args) {
        // Проверка задания 3
	    Person him = new Person("Иванов Иван Иванович", "Тестер", "ivan@mail.ru",
                "89101286754", 34000, 28);
	    him.getInfo();
        System.out.println();
        // Задание 4
	    Person[] personArray = TaskFour();
	    // Задание 5
        getInfoAboveForty(personArray);

    }
    public static Person[] TaskFour(){
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Алексеев Петр Григорьевич", "Тестер", "ap@mail.ru",
                "89104566544", 38000, 40);
        personArray[1] = new Person("Петров Григорий Максимович", "Фронтендер", "pg@mail.ru",
                "89111238402", 40000, 42);
        personArray[2] = new Person("Максимов Олег Петрович", "Тестер", "mo@mail.ru",
                "8987987263", 38000, 37);
        personArray[3] = new Person("Смирнов Роман Артурович", "Бэкендер", "sr@mail.ru",
                "89561475289", 42000, 25);
        personArray[4] = new Person("Назаров Олег Александрович", "Бэкендер", "no@mail.ru",
                "89998521298", 42000, 44);
        return personArray;
    }

    public static void getInfoAboveForty(Person[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].getAge() > 40){
                array[i].getInfo();
                System.out.println();
            }
        }
    }
}
