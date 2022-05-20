package codewars.kyu_5;

//Take the following IPv4 address: 128.32.10.1
//
//        This address has 4 octets where each octet is a single byte (or 8 bits).
//
//        1st octet 128 has the binary representation: 10000000
//        2nd octet 32 has the binary representation: 00100000
//        3rd octet 10 has the binary representation: 00001010
//        4th octet 1 has the binary representation: 00000001
//        So 128.32.10.1 == 10000000.00100000.00001010.00000001
//
//        Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
//
//        Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
//
//        Examples
//        2149583361 ==> "128.32.10.1"
//        32         ==> "0.0.0.32"
//        0          ==> "0.0.0.0"

public class IntToIpv4 {

    public static void main(String[] args) {
        System.out.println(longToIP(3232235521L));
        System.out.println(longToIpSmartSolution(3232235521L));
    }

    //smarter solution
    public static String longToIpSmartSolution(long ip) {

        long fourthOctet = ip % 256;
        long thirdOctet = (ip / 256) % 256;
        long secondOctet = (ip / (256 * 256)) % 256;
        long firstOctet = (ip / (256 * 256 * 256)) % 256;
        return firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;
    }

    //complex solution
    public static String longToIP(long num) {

        String binaryOfNum = decimalToBinary(num);
        return
                binaryOctetToDecimal(binaryOfNum.substring(0, 8)) + "." +
                        binaryOctetToDecimal(binaryOfNum.substring(8, 16)) + "." +
                        binaryOctetToDecimal(binaryOfNum.substring(16, 24)) + "." +
                        binaryOctetToDecimal(binaryOfNum.substring(24, 32));

    }

    private static String decimalToBinary(long num) {
        StringBuilder binaryOfNum = new StringBuilder("");

        for (int i = 31; i >= 0; i--) {
            if (num / Math.pow(2, i) >= 1) {
                num = (long) (num % Math.pow(2, i));
                binaryOfNum.append(1);
            } else {
                binaryOfNum.append(0);
            }
        }
        return binaryOfNum.toString();
    }

    private static int binaryOctetToDecimal(String num) {
        int result = 0;
        for (int i = 0; i <= 7; i++) {
            if (num.charAt(i) == '1') {
                result += Math.pow(2, num.length() - i - 1);
            }
        }
        return result;
    }
}
