public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int seconds = currentSeconds + currentMinutes*60 + currentHours*3600;
        int daySeconds = 86400;

        System.out.println(daySeconds-seconds + " seconds left of this day.");

    }
}