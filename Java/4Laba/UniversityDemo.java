import java.util.ArrayList;
import java.util.List;

// Абстрактный базовый класс
abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Статический счетчик для всех объектов
    private static int personCount = 0;

    // Конструктор по умолчанию
    public Person() {
        this.firstName = "Неизвестно";
        this.lastName = "Неизвестно";
        this.age = 0;
        personCount++;
    }

    // Конструктор с параметрами
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personCount++;
    }

    // Абстрактный метод (принцип абстракции)
    public abstract void displayRole();

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Статический метод для получения счетчика
    public static int getPersonCount() {
        return personCount;
    }

    // Общий метод для всех наследников (принцип полиморфизма)
    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + " " + lastName + ", Возраст: " + age;
    }
}

// Дочерний класс Студент
class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;

    public Student() {
        super();
        this.studentId = "000000";
        this.major = "Не выбран";
        this.gpa = 0.0;
    }

    public Student(String firstName, String lastName, int age,
                   String studentId, String major, double gpa) {
        super(firstName, lastName, age);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    // Реализация абстрактного метода (принцип полиморфизма)
    @Override
    public void displayRole() {
        System.out.println("Я студент");
    }

    // Специфические методы для студента
    public void study() {
        System.out.println(getFirstName() + " " + getLastName() + " учится по специальности " + major);
    }

    public void takeExam(String subject) {
        System.out.println("Студент " + getFirstName() + " сдает экзамен по " + subject);
    }

    // Геттеры и сеттеры
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + studentId + ", Специальность: " + major + ", GPA: " + gpa;
    }
}

// Дочерний класс Преподаватель
class Teacher extends Person {
    private String department;
    private String academicDegree;
    private int yearsOfExperience;

    public Teacher() {
        super();
        this.department = "Не определен";
        this.academicDegree = "Не указана";
        this.yearsOfExperience = 0;
    }

    public Teacher(String firstName, String lastName, int age,
                   String department, String academicDegree, int yearsOfExperience) {
        super(firstName, lastName, age);
        this.department = department;
        this.academicDegree = academicDegree;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Реализация абстрактного метода
    @Override
    public void displayRole() {
        System.out.println("Я преподаватель");
    }

    // Специфические методы для преподавателя
    public void teach(String subject) {
        System.out.println("Преподаватель " + getFirstName() + " преподает " + subject);
    }

    public void conductResearch() {
        System.out.println("Преподаватель " + getFirstName() + " проводит исследование в отделе " + department);
    }

    // Геттеры и сеттеры
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Отдел: " + department +
                ", Ученая степень: " + academicDegree +
                ", Опыт работы: " + yearsOfExperience + " лет";
    }
}

// Дочерний класс Ассистент преподавателя
class TeachingAssistant extends Person {
    private String assistingCourse;
    private int hoursPerWeek;
    private boolean isGraduateStudent;

    public TeachingAssistant() {
        super();
        this.assistingCourse = "Не назначен";
        this.hoursPerWeek = 0;
        this.isGraduateStudent = false;
    }

    public TeachingAssistant(String firstName, String lastName, int age,
                             String assistingCourse, int hoursPerWeek, boolean isGraduateStudent) {
        super(firstName, lastName, age);
        this.assistingCourse = assistingCourse;
        this.hoursPerWeek = hoursPerWeek;
        this.isGraduateStudent = isGraduateStudent;
    }

    // Реализация абстрактного метода
    @Override
    public void displayRole() {
        System.out.println("Я ассистент преподавателя");
    }

    // Специфические методы для ассистента
    public void assistInLab() {
        System.out.println("Ассистент " + getFirstName() + " помогает в лабораторной работе по курсу " + assistingCourse);
    }

    public void gradeAssignments() {
        System.out.println("Ассистент " + getFirstName() + " проверяет задания студентов");
    }

    // Геттеры и сеттеры
    public String getAssistingCourse() {
        return assistingCourse;
    }

    public void setAssistingCourse(String assistingCourse) {
        this.assistingCourse = assistingCourse;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        if (hoursPerWeek >= 0) {
            this.hoursPerWeek = hoursPerWeek;
        }
    }

    public boolean isGraduateStudent() {
        return isGraduateStudent;
    }

    public void setGraduateStudent(boolean graduateStudent) {
        isGraduateStudent = graduateStudent;
    }

    @Override
    public String toString() {
        return super.toString() + ", Курс: " + assistingCourse +
                ", Часов в неделю: " + hoursPerWeek +
                ", Аспирант: " + (isGraduateStudent ? "Да" : "Нет");
    }
}

// Демонстрационный класс
public class UniversityDemo {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ПРИНЦИПОВ ООП ===\n");

        // Создание объектов разных классов
        Student student1 = new Student("Иван", "Петров", 20, "S12345", "Информатика", 3.8);
        Student student2 = new Student("Мария", "Сидорова", 19, "S12346", "Математика", 4.0);

        Teacher teacher1 = new Teacher("Алексей", "Иванов", 45,
                "Компьютерные науки", "Доктор наук", 15);

        TeachingAssistant ta1 = new TeachingAssistant("Екатерина", "Козлова", 25,
                "Программирование", 10, true);

        // Демонстрация полиморфизма
        System.out.println("=== ПОЛИМОРФИЗМ ===");
        List<Person> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(teacher1);
        people.add(ta1);

        for (Person person : people) {
            person.introduce(); // Общий метод из базового класса
            person.displayRole(); // Абстрактный метод, реализованный по-разному
            System.out.println();
        }

        // Демонстрация инкапсуляции через геттеры и сеттеры
        System.out.println("=== ИНКАПСУЛЯЦИЯ ===");
        student1.setGpa(3.9);
        System.out.println("Новый GPA студента: " + student1.getGpa());

        teacher1.setYearsOfExperience(16);
        System.out.println("Новый опыт преподавателя: " + teacher1.getYearsOfExperience() + " лет\n");

        // Демонстрация специфического поведения
        System.out.println("=== СПЕЦИФИЧЕСКОЕ ПОВЕДЕНИЕ ===");
        student1.study();
        student1.takeExam("Java программирование");
        System.out.println();

        teacher1.teach("Объектно-ориентированное программирование");
        teacher1.conductResearch();
        System.out.println();

        ta1.assistInLab();
        ta1.gradeAssignments();
        System.out.println();

        // Вывод информации о объектах
        System.out.println("=== ИНФОРМАЦИЯ ОБ ОБЪЕКТАХ ===");
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 2: " + student2);
        System.out.println("Преподаватель: " + teacher1);
        System.out.println("Ассистент: " + ta1);
        System.out.println();

        // Демонстрация статического счетчика
        System.out.println("=== СТАТИЧЕСКИЙ СЧЕТЧИК ===");
        System.out.println("Всего создано объектов Person: " + Person.getPersonCount());

        // Создание еще одного объекта для демонстрации счетчика
        Student student3 = new Student();
        System.out.println("После создания дополнительного студента: " + Person.getPersonCount());
    }
}