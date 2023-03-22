public class RandomExamples {

    public static void typeCastingExample(){
//        Implicit typecasting
// byte-->short-->int-->long-->float-->double
//            char→↑
        byte x = 9;
        x = 9 * 10;

        MyOutputPrinterClass.pl("The value x is " + x);

//        Explicit typecasting
// double-->float-->long-->int-->short-->byte
        int y = 100;
        byte x1 = (byte)y;
        MyOutputPrinterClass.pl("The value x1 is " + x1);
    }
}
