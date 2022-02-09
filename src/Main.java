import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //LSB --> MSB
        System.out.println("Convert from binary to decimal");
        System.out.print("Binary: ");
        String newByte = scan.nextLine();

        int decimalNumber = 0;
        int multiplier = 1;

        for (int i = 0; i < newByte.length(); i++) {
            char c = newByte.charAt(i);
            int decimal = Character.getNumericValue(c);
            decimalNumber += decimal*multiplier;
            multiplier = multiplier*2;
        }

        System.out.println("Decimal: " + decimalNumber);

        //En hurtigere metode
        /*int byteInDecimal = Integer.parseInt(newByte, 2);
        System.out.print("Decimal: ");
        System.out.println(byteInDecimal);*/
    }
}
