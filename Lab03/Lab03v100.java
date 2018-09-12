// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03v100
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 100 Point Version\n");
      int initial = 10000000;
      int hours = initial / 3600000;
      int seconds = initial % 3600000;
      int minutes = seconds / 60000;
      seconds = seconds % 60000;
      int milliseconds = seconds / 1000;
      System.out.println("Starting milliseconds:   " + initial);
      System.out.println("Hours:                   " + hours);
      System.out.println("Minutes:                 " + minutes);
      System.out.println("Seconds:                 " + seconds);
      System.out.println("Milliseconds:            " + milliseconds);
    }
}
