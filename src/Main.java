public class Main {
    public static void main(String[] args) {

        //Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        //Задание 2

        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameInUpperCase);


        //Задание 3

        fullName = "Иванов Семён Семёнович";
        String fullNameWithoutYo = fullName.replace('ё', 'е');
        fullNameWithoutYo = fullNameWithoutYo.replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника - " + fullNameWithoutYo);

    }
}