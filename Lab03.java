public class Lab03
{

    public static void main(String args[])
    {
        int milli = 10000123;
        int hour;
        int min;
        int sec;
        int mills;
        System.out.println("Lab03, 100 Point Version\n");
        System.out.println("Starting milli-seconds: " + milli);
        hour = milli/3600000;
        System.out.println("Hours: " + hour);
        milli = milli%3600000;
        min = milli/60000;
        System.out.println("Minutes: " + min);
        sec = milli%61;
        System.out.println("Seconds: " + sec);
        mills = milli%125;
        System.out.println("milli Seconds: " + mills);
    }


}
