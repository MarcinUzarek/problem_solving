package codewars.kyu_5;

//Write a function, which takes a non-negative integer (seconds) as input and returns
// the time in a human-readable format (HH:MM:SS)
//
//        HH = hours, padded to 2 digits, range: 00 - 99
//        MM = minutes, padded to 2 digits, range: 00 - 59
//        SS = seconds, padded to 2 digits, range: 00 - 59
//        The maximum time never exceeds 359999 (99:59:59)


public class HumanReadableTime {

    public static void main(String[] args) {

        System.out.println(makeReadable(86399));
        System.out.println(86399 % 60);

    }

    public static String makeReadable(int seconds) {

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int secs = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
