import java.util.ArrayList;
import java.util.List;

// АБСТРАКТНЫЙ БАЗОВЫЙ КЛАСС - ЧЕЛОВЕК
abstract class Person {
    private String name;
    private int age;
    private String email;

    // СТАТИЧЕСКИЙ СЧЕТЧИК - считает всех созданных людей
    private static int totalPeople = 0;

    // КОНСТРУКТОР ПО УМОЛЧАНИЮ
    public Person() {
        this.name = "Неизвестно";
        this.age = 0;
        this.email = "нет";
        totalPeople++; // Увеличиваем счетчик при создании объекта
    }

    // КОНСТРУКТОР С ПАРАМЕТРАМИ
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        totalPeople++;
    }

    // АБСТРАКТНЫЙ МЕТОД - каждый наследник реализует по-своему
    public abstract void work();

    // ОБЩИЙ МЕТОД ДЛЯ ВСЕХ НАСЛЕДНИКОВ
    public void introduce() {
        System.out.println("Привет! Я " + name + ", мне " + age + " лет");
    }

    // ГЕТТЕРЫ И СЕТТЕРЫ (инкапсуляция)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // СТАТИЧЕСКИЙ МЕТОД - работает с общим счетчиком
    public static int getTotalPeople() {
        return totalPeople;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет) - " + email;
    }
}

// КЛАСС СТУДЕНТ - наследуется от Человека
class Student extends Person {
    private String studentId;
    private String faculty;
    private int course;

    public Student() {
        super(); // Вызов конструктора родителя
        this.studentId = "000000";
        this.faculty = "Не определён";
        this.course = 1;
    }

    public Student(String name, int age, String email,
                   String studentId, String faculty, int course) {
        super(name, age, email); // Вызов конструктора родителя с параметрами
        this.studentId = studentId;
        this.faculty = faculty;
        this.course = course;
    }

    // РЕАЛИЗАЦИЯ АБСТРАКТНОГО МЕТОДА - студент учится
    @Override
    public void work() {
        System.out.println(getName() + " учится на " + course + " курсе факультета " + faculty);
    }

    // СПЕЦИФИЧЕСКИЕ МЕТОДЫ СТУДЕНТА
    public void takeExam(String subject) {
        System.out.println("Студент " + getName() + " сдает экзамен по: " + subject);
    }

    public void doHomework() {
        System.out.println("Студент " + getName() + " делает домашнее задание");
    }

    // ГЕТТЕРЫ И СЕТТЕРЫ
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public int getCourse() { return course; }
    public void setCourse(int course) {
        if (course >= 1 && course <= 6) this.course = course;
    }

    @Override
    public String toString() {
        return "СТУДЕНТ: " + super.toString() + ", ID: " + studentId +
                ", Факультет: " + faculty + ", Курс: " + course;
    }
}

// КЛАСС ПРЕПОДАВАТЕЛЬ - наследуется от Человека
class Teacher extends Person {
    private String department;
    private String subject;
    private int experience;

    public Teacher() {
        super();
        this.department = "Не определён";
        this.subject = "Не определён";
        this.experience = 0;
    }

    public Teacher(String name, int age, String email,
                   String department, String subject, int experience) {
        super(name, age, email);
        this.department = department;
        this.subject = subject;
        this.experience = experience;
    }

    // РЕАЛИЗАЦИЯ АБСТРАКТНОГО МЕТОДА - преподаватель преподает
    @Override
    public void work() {
        System.out.println("Преподаватель " + getName() + " преподает: " + subject);
    }

    // СПЕЦИФИЧЕСКИЕ МЕТОДЫ ПРЕПОДАВАТЕЛЯ
    public void conductLecture() {
        System.out.println("Преподаватель " + getName() + " проводит лекцию");
    }

    public void checkPapers() {
        System.out.println("Преподаватель " + getName() + " проверяет работы студентов");
    }

    // ГЕТТЕРЫ И СЕТТЕРЫ
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) {
        if (experience >= 0) this.experience = experience;
    }

    @Override
    public String toString() {
        return "ПРЕПОДАВАТЕЛЬ: " + super.toString() + ", Кафедра: " + department +
                ", Предмет: " + subject + ", Опыт: " + experience + " лет";
    }
}

// КЛАСС АССИСТЕНТ - наследуется от Человека
class TeachingAssistant extends Person {
    private String assistedSubject;
    private int hoursPerWeek;
    private boolean isGraduate;

    public TeachingAssistant() {
        super();
        this.assistedSubject = "Не определён";
        this.hoursPerWeek = 0;
        this.isGraduate = false;
    }

    public TeachingAssistant(String name, int age, String email,
                             String assistedSubject, int hoursPerWeek, boolean isGraduate) {
        super(name, age, email);
        this.assistedSubject = assistedSubject;
        this.hoursPerWeek = hoursPerWeek;
        this.isGraduate = isGraduate;
    }

    // РЕАЛИЗАЦИЯ АБСТРАКТНОГО МЕТОДА - ассистент помогает
    @Override
    public void work() {
        System.out.println("Ассистент " + getName() + " помогает по предмету: " + assistedSubject);
    }

    // СПЕЦИФИЧЕСКИЕ МЕТОДЫ АССИСТЕНТА
    public void helpStudents() {
        System.out.println("Ассистент " + getName() + " помогает студентам");
    }

    public void prepareMaterials() {
        System.out.println("Ассистент " + getName() + " готовит материалы для занятия");
    }

    // ГЕТТЕРЫ И СЕТТЕРЫ
    public String getAssistedSubject() { return assistedSubject; }
    public void setAssistedSubject(String assistedSubject) { this.assistedSubject = assistedSubject; }

    public int getHoursPerWeek() { return hoursPerWeek; }
    public void setHoursPerWeek(int hoursPerWeek) {
        if (hoursPerWeek >= 0) this.hoursPerWeek = hoursPerWeek;
    }

    public boolean isGraduate() { return isGraduate; }
    public void setGraduate(boolean graduate) { isGraduate = graduate; }

    @Override
    public String toString() {
        return "АССИСТЕНТ: " + super.toString() + ", Предмет: " + assistedSubject +
                ", Часов/неделю: " + hoursPerWeek + ", Аспирант: " + (isGraduate ? "Да" : "Нет");
    }
}

// ГЛАВНЫЙ КЛАСС ДЛЯ ДЕМОНСТРАЦИИ
public class UniversityDemo {
    public static void main(String[] args) {
        System.out.println("УНИВЕРСИТЕТ - ПРИНЦИПЫ ООП \n");

        // ШАГ 1: СОЗДАЕМ ОБЪЕКТЫ РАЗНЫХ КЛАССОВ
        System.out.println("=== СОЗДАНИЕ ОБЪЕКТОВ ===");

        Student student = new Student("Анна Иванова", 20, "anna@university.ru",
                "S2024001", "Информатика", 2);

        Teacher teacher = new Teacher("Дмитрий Петров", 45, "dmitry@university.ru",
                "Компьютерные науки", "Программирование", 15);

        TeachingAssistant assistant = new TeachingAssistant("Сергей Козлов", 25, "sergey@university.ru",
                "Программирование", 12, true);

        // ШАГ 2: ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА
        System.out.println("\n=== ПОЛИМОРФИЗМ (один интерфейс - разное поведение) ===");

        // Создаем список разных людей - работает с ними одинаково
        List<Person> universityPeople = new ArrayList<>();
        universityPeople.add(student);
        universityPeople.add(teacher);
        universityPeople.add(assistant);

        // Один и тот же метод work() работает по-разному для каждого объекта
        for (Person person : universityPeople) {
            person.introduce();  // Общий метод из родительского класса
            person.work();       // Абстрактный метод - разная реализация
            System.out.println("---");
        }

        // ШАГ 3: ДЕМОНСТРАЦИЯ ИНКАПСУЛЯЦИИ
        System.out.println("=== ИНКАПСУЛЯЦИЯ (контроль доступа к данным) ===");

        // Используем геттеры для чтения данных
        System.out.println("Имя студента: " + student.getName());
        System.out.println("Email преподавателя: " + teacher.getEmail());

        // Используем сеттеры для изменения данных с проверкой
        student.setAge(21);  // Корректное значение
        student.setAge(-5);  // Некорректное значение - не изменится
        System.out.println("Возраст студента после изменения: " + student.getAge());

        // ШАГ 4: ВЫВОД ИНФОРМАЦИИ ОБ ОБЪЕКТАХ
        System.out.println("\n=== ИНФОРМАЦИЯ О ВСЕХ ОБЪЕКТАХ ===");
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(assistant);

        // ШАГ 5: ДЕМОНСТРАЦИЯ СПЕЦИФИЧЕСКОГО ПОВЕДЕНИЯ
        System.out.println("\n=== СПЕЦИФИЧЕСКОЕ ПОВЕДЕНИЕ КАЖДОГО КЛАССА ===");

        student.takeExam("Java программирование");
        student.doHomework();
        System.out.println();

        teacher.conductLecture();
        teacher.checkPapers();
        System.out.println();

        assistant.helpStudents();
        assistant.prepareMaterials();

        // ШАГ 6: ДЕМОНСТРАЦИЯ СТАТИЧЕСКОГО СЧЕТЧИКА
        System.out.println("\n=== СТАТИЧЕСКИЙ СЧЕТЧИК ОБЪЕКТОВ ===");
        System.out.println("Всего создано людей в системе: " + Person.getTotalPeople());

        // Создаем еще один объект и проверяем счетчик
        Student newStudent = new Student();
        System.out.println("После создания нового студента: " + Person.getTotalPeople());
    }
}