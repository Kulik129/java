import java.util.Scanner;
public class prog {
    public static void main(String[] args) {
        kalkulyalor(); //1 шаг. Открытие калькулятора
    }

    static void open_k(){
        kalkulyalor();
    }

    static void yes_no(){
        Scanner iScanner1 = new Scanner(System.in);
            System.out.println("Введите 1 если хотите продолжить!\nВведите 2 если хотите остановить!");
            String message = iScanner1.next();
            switch (message) {
                case "да":
                open_k();
                    break;
                case "нет":
                System.out.println("ПОКА-ПОКА!!");
                System. exit(0);
                    break;
            }
            iScanner1.close();
    }

    static void  kalkulyalor(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите число 2: ");
        int number2 = iScanner.nextInt();
        System.out.print("Введите операцию ");
        String operation = iScanner.next();
        // iScanner.close(); Выходит ошибка Exception in thread "main" java.lang.IllegalStateException: Scanner closed 
        switch(operation){
            case "+":
            System.out.println(number1+number2);
            yes_no();
                break;

            case "*":
            System.out.println(number1*number2);
            yes_no();
                break;

            case "/":
            System.out.println(number1/number2);
            yes_no();
                break;

            case "-":
            System.out.println(number1-number2);
            yes_no();
                break;
            
            
        }
        // iScanner.close(); Выходит ошибка Exception in thread "main" java.lang.IllegalStateException: Scanner closed 
    }
}
