public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task1() {
        System.out.println("задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
    private static void task2() {
        System.out.println("задача 2");
        String fullName ="Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("задача 3");
        String fullName = "Семёнов Семен Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }

}