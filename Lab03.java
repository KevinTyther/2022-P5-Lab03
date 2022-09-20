public class Lab03
{

    public static void main(String args[])
    {
        int milli = 10000123;
        int hour;
        int min;
        int sec;
        int mills;
        System.out.println("\nLab03, 100 Point Version\n");
        System.out.println("Starting milli-seconds: " + milli);
        hour = milli/3600000;
        System.out.println("Hours: \t\t\t\t\t" + hour);
        milli = milli%3600000;
        min = milli/60000;
        System.out.println("Minutes: \t\t\t\t" + min);
        sec = milli%61;
        System.out.println("Seconds: \t\t\t\t" + sec);
        mills = milli%125;
        System.out.println("milli Seconds: \t\t\t" + mills);
    }


}
