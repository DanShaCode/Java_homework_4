package task3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {

    private static void operationsMenu(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println("      МЕНЮ ОПЕРАЦИЙ");
        System.out.println("===========================");
        System.out.println();
        System.out.println("1. Сложение");
        System.out.println();
        System.out.println("2. Вычитание");
        System.out.println();
        System.out.println("3. Умножение");
        System.out.println();
        System.out.println("4. Деление");
        System.out.println();
        System.out.print("Введите цифру из меню: ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            sumNum(numFormat, scanner, res);
        }
        if (userInput == 2) {
            diffNum(numFormat, scanner, res);
        }
        if (userInput == 3) {
            prodNum(numFormat, scanner, res);
        }
        if (userInput == 4) {
            divideNum(numFormat, scanner, res);
        }
    }

    private static void table(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println("ТЕКУЩЕЕ ЗНАЧЕНИЕ НА ТАБЛО");
        System.out.println("=========================");
        System.out.println("            " + numFormat.format(res));
        System.out.println("=========================");
        System.out.println();
        System.out.print("Введите число: ");
        double userIput = scanner.nextDouble();
        res = userIput;
        calc(numFormat, scanner, res);
    }

    private static void calc(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println(" ТЕКУЩЕЕ ЗНАЧЕНИЕ НА ТАБЛО");
        System.out.println("===========================");
        System.out.println("             " + numFormat.format(res));
        System.out.println("===========================");
        System.out.println();
        System.out.println();
        System.out.println("ОСНОВНОЕ МЕНЮ КАЛЬКУЛЯТОРА");
        System.out.println("===========================");
        System.out.println();
        System.out.println("1. Ввести число на табло");
        System.out.println();
        System.out.println("2. Операции");
        System.out.println();
        System.out.println("3. Очистить табло");
        System.out.println();
        System.out.println("4. Закрыть калькулятор");
        System.out.println();
        System.out.print("Введите цифру из меню: ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            table(numFormat, scanner, res);
        }
        if (userInput == 2) {
            operationsMenu(numFormat, scanner, res);
        }
        if (userInput == 3) {
            res = 0;
            calc(numFormat, scanner, res);
        }
        if (userInput == 4) {
            System.out.println("\033[H\033[2J");
            return;
        }
    }

    private static void sumNum(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        double op = res + num;
        calc(numFormat, scanner, op);
    }

    private static void diffNum(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        double op = res - num;
        calc(numFormat, scanner, op);
    }

    private static void prodNum(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        double op = res * num;
        calc(numFormat, scanner, op);
    }

    private static void divideNum(DecimalFormat numFormat, Scanner scanner, double res) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        System.out.println();
        if (num == 0) {
            System.out.println("ОШИБКА");
            System.out.println();
            System.out.print("Введите q для возврата в Основное меню: ");
            String userWait = scanner.next();
            if (userWait == "q" || userWait == "Q"){
                calc(numFormat, scanner, res);
            }  else {
                calc(numFormat, scanner, res);
            }
        }  else {
            double op = res / num;
            calc(numFormat, scanner, op);
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat();
        numFormat.setDecimalSeparatorAlwaysShown(false);
        double res = 0;
        numFormat.format(res);
        calc(numFormat, scanner, res);
        scanner.close();
    }
}
