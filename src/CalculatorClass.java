import java.util.Scanner;
public class CalculatorClass {
    public static void doCalculations() {
        char op= '\u0000';
        int num1= 0, num2= 0, result= 0;
        Scanner myScanner = MyInputScanner.myScannerInput();

        num1 = myScanner.nextInt();
        op = myScanner.next().charAt(0);
        num2 = myScanner.nextInt();

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        MyOutputPrinterClass.p("a " + op + " b= " + result);
    }
}
