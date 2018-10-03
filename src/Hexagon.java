import java.util.Scanner;

public class Hexagon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Beder user om at intaste en længde
        System.out.print("Please enter the length of the side: ");
        Double side = input.nextDouble();

        // Udregner Hexagonets areal ud fra den angivende side
        Double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area);
    }
}
