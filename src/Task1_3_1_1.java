import java.io.File;

public class Task1_3_1_1 {
    //  Закончил на мин 20 15
    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tСоздайте классы с полями для описания структуры университета." +
                "\n\nРешение: ");
        System.out.println("Создаем класс UniversityStructure со следующими полями: Факуьтет, Срок обучения (лет)");

        UniversityStructure universityStructure1 = new UniversityStructure();  // - экземпляр класса
        universityStructure1.faculty = "Юриспруденция";
        universityStructure1.studyPeriod = 3;
        UniversityStructure universityStructure2 = new UniversityStructure();  // - экземпляр класса
        universityStructure2.faculty = "Программирование";
        universityStructure2.studyPeriod = 4;

        System.out.println("Факультет: " + universityStructure2.faculty + ", Срок обучения, кол-во лет: " + universityStructure2.studyPeriod);
        System.out.println(); // Это перенос строки

        System.out.println("Создаем второй класс Tutors со следующими полями: Фамилия, Кол-во предметов");

        Tutors tutors1 = new Tutors();  // - экземпляр класса
        tutors1.familyName = "Иванов";
        tutors1.academicSubjects = 1;
        Tutors tutors2 = new Tutors();  // - экземпляр класса
        tutors2.familyName = "Петров";
        tutors2.academicSubjects = 2;

        System.out.println("Фамилия: " + tutors2.familyName + ", Кол-во предметов: " + tutors2.academicSubjects);



//        String faculty1 = "Юриспруденция";
//        int studyPeriod1 = 3;
//        String faculty2 = "Программирование";
//        int studyPeriod2 = 4;
//        String faculty3 = "Психология";
//        int studyPeriod3 = 5;
//
//        System.out.println("Факультет: " + faculty3 + ", Срок обучения: " + studyPeriod3 + " лет.");
    }
}
//        Конец Примера _ КККККККККККККККК


////        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tСоздайте классы с полями для описания структуры университета." +
//                "\n\nРешение: ");
//
//            File file = new File("test.txt");
//            /*String absolutePath = file.getAbsolutePath();
//            String fileName = file.getName();
//            long size = file.length();*/
//
//            FileInformation info = new FileInformation();
//            info.absolutePath = file.getAbsolutePath();
//            info.fileName = file.getName();
//            info.size = file.length();
//
//            File file2 = new File("book.txt");
//            FileInformation info2 = new FileInformation();
//            info2.absolutePath = file2.getAbsolutePath();
//            info2.fileName = file2.getName();
//            info2.size = file2.length();
//
//
////            if (size>size2) {
////                System.out.println("Bigger file : ");
////                System.out.println(fileName);
////                System.out.println("Path: " + absolutePath);
////                System.out.println("Size is: " + size);
////
////
////            } else {
////                System.out.println("Bigger file : ");
////                System.out.println(fileName2);
////                System.out.println("Path: " + absolutePath2);
////                System.out.println("Size is: " + size2);
////
////
////            }
////            FileInformation bigInfo = info.size > info2.size ? info : info2;
////            if (info.size>info2.size) {
////                bigInfo = info;
////                /*System.out.println("Bigger file : ");
////                System.out.println(info.fileName);
////                System.out.println("Path: " + info.absolutePath);
////                System.out.println("Size is: " + info.size);*/
////
////
////            } else {
////                bigInfo = info2;
////                /*System.out.println("Bigger file : ");
////                System.out.println(info2.fileName);
////                System.out.println("Path: " + info2.absolutePath);
////                System.out.println("Size is: " + info2.size);*/
////            }
//
//            //  Заменить на тернарный оператор
//        FileInformation bigInfo = info.size > info2.size ? info : info2;
//
//
//        System.out.println("Bigger file : ");
//                System.out.println(bigInfo.fileName);
//                System.out.println("Path: " + bigInfo.absolutePath);
//                System.out.println("Size is: " + bigInfo.size);
//
//
//
//    }
//}
////        Конец Примера 2 КККККККККККККККК


////        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tСоздайте классы с полями для описания структуры университета." +
//                "\n\nРешение: ");
//
//            System.out.println("Создаем класс со следующими полями: Факуьтет, Специальность, " +
//                    "Количество предметов.");
//
//            University university1 = new University();
//            university1.faculty1 = "Jurisprudence";
//            university1.specialization1 = "Python Developer";
//            university1.academicSubjectsNumber1 = 5;
//            University university2 = new University();
//            university2.faculty2 = "Programming";
//            university1.specialization2 = "Java Developer";
//            university2.academicSubjectsNumber2 = 7;
//            University university3 = new University();
//            university3.faculty3 = "Psychology";
//            university3.specialization3 = "Developer in C++";
//            university3.academicSubjectsNumber3 = 10;
//
//    }
//}
////        Конец Примера 1 КККККККККККККККК
