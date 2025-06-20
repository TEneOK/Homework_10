//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = (middleName + " " + firstName + " " + lastName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Task2");
        System.out.println(fullName.toUpperCase());

        System.out.println("Task3");
        middleName = "Семён";
        lastName = "Семёнович";
        String notE = (middleName + " " + firstName + " " + lastName);
        notE = notE.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + notE);
    }
}