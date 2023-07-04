public class Task1_3_1_2 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП  РАБОТАЕТ, НО БЕЗ ВЛОЖЕННЫХ КЛАССОВ
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tСоздайте классы для описания операционных систем" +
                "\n\nРешение: ");

        System.out.println("Созаем класс OperatingSystems");
        OperatingSystems operatingSystems1 = new OperatingSystems();
        operatingSystems1.name = "Windows";
        operatingSystems1.age = 38;

        OperatingSystems operatingSystems2 = new OperatingSystems();
        operatingSystems2.name = "Ubuntu";
        operatingSystems2.age = 12;

        OperatingSystems operatingSystems3 = new OperatingSystems();
        operatingSystems3.name = "macOS";
        operatingSystems3.age = 39;

        System.out.println("Операционная система " + operatingSystems3.name + "имеет возраст "
                + operatingSystems3.age + " лет.");

//        String name1 = "Windows";
//        int age1 = 38;
//        String name2 = "Ubuntu";
//        int age2 = 12;
//        String name3 = "macOS";
//        int age3 = 39;



    }
}
//        Конец Примера _ КККККККККККККККК