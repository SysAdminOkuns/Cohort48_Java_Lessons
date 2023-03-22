import java.util.Scanner;
public class MyInputScanner {
    public static Scanner myScannerInput(){
        return new Scanner(System.in);
    }
    //    useDelimiter("\s")
    public static Scanner myScannerInput1(){
        return new Scanner(System.in).useDelimiter("\\s*");
    }
}
