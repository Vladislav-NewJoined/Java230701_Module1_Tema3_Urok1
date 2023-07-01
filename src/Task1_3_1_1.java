public class Task1_3_1_1 {

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tСоздайте классы с полями для описания структуры университета." +
                "\n\nРешение: ");
        System.out.println("Создаем класс UniversityStructure со следующими полями: Факультет, " +
                "\nСрок обучения (лет), и внутри него создаем второй класс Tutors со следующими " +
                "\nполями: Фамилия преподавателя,  Кол-во предметов");
        System.out.println(); // Это перенос строки
        UniversityStructure universityStructure1 = new UniversityStructure();  // - экземпляр класса
        universityStructure1.faculty = "Юриспруденция";
        universityStructure1.studyPeriod = 3;

        UniversityStructure universityStructure2 = new UniversityStructure();  // - экземпляр класса
        universityStructure2.faculty = "Программирование";
        universityStructure2.studyPeriod = 4;

        System.out.println("Факультет: " + universityStructure2.faculty + ", Срок обучения (кол-во лет): " + universityStructure2.studyPeriod);

        UniversityStructure.Tutors tutors1 = universityStructure2.new Tutors();  // - экземпляр класса
        tutors1.familyName = "Иванов";
        tutors1.academicSubjects = 1;

        UniversityStructure.Tutors tutors2 = universityStructure2.new Tutors();  // - экземпляр класса
        tutors2.familyName = "Петров";
        tutors2.academicSubjects = 2;

        System.out.println("Фамилия преподавателя: " + tutors2.familyName + ", Кол-во предметов: " + tutors2.academicSubjects);

    }
}