import java.io.PrintStream;
public class MyScannerReaderClass {
    public static void readUserInput(){
        int totalLength;
        MyOutputPrinterClass.p("Please, enter your first string input: ");
        String input1= MyInputScanner.myScannerInput().next();
        MyOutputPrinterClass.p("Please, enter your second string input: ");
        String input2= MyInputScanner.myScannerInput().next();

        totalLength= input1.length() + input2.length();

        if(totalLength % 2 == 0){
            System.out.println("The total length is an even number");
        }else{
            System.out.println("The total length is an odd number");
        }

    }
}
