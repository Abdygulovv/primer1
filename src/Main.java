import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        if (month.equalsIgnoreCase("Январь")) {
            System.out.println("Зима");
        } else if (month.equalsIgnoreCase("Май")) {
            System.out.println("Весна");
        }else if (month.equalsIgnoreCase("Август")) {
                System.out.println("Лето");
        }else if (month.equalsIgnoreCase("Октябрь")) {
            System.out.println("Осень");
        }else {
            System.out.println("Месяц не существует");
            {

            System.out.println("-----");

}
            System.out.print("Введите название месяца: ");
            String month1 = scanner.nextLine();

            switch (month1) {
                case "Январь":
                    System.out.println("Зима");
                    break;

                case "Май":
                    System.out.println("Весна");
                    break;

                case "Август":
                    System.out.println("Лето");
                    break;

                case "Октябрь":
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Месяц не существует");
                    break;
            }

        }
    }
}