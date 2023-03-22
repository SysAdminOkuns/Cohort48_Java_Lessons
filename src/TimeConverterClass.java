public class TimeConverterClass {
    public static String convertSecondsTimeFormat(){
        /**
         *  Given an int value in seconds converts to
         *  Time format hh:mm:ss
         */
        //
        MyOutputPrinterClass.p("Please, enter your time in seconds: ");
        int valueTimeInSecs = MyInputScanner.myScannerInput().nextInt();
        int hours = (valueTimeInSecs / 3600) % 12;
        int minutes = (valueTimeInSecs % 3600)/ 60;
        int seconds = valueTimeInSecs % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return timeString;
    }
}
