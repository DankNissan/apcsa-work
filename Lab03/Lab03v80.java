// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03v80
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 80 Point Version\n");
      int initial = 10000;
      int hours = initial / 3600;
      int seconds = initial % 3600;
      int minutes = seconds / 60;
      seconds = seconds % 60;
      System.out.println("Starting seconds:   " + initial);
      System.out.println("Hours:              " + hours);
      System.out.println("Minutes:            " + minutes);
      System.out.println("Seconds:            " + seconds);
    }
}

