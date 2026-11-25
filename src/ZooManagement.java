import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbrCages;
        do {
            System.out.print("Enter the number of cages (positive): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer: ");
                scanner.next();
            }
            nbrCages = scanner.nextInt();
        } while (nbrCages <= 0);
        scanner.nextLine();

        String zooName;
        do {
            System.out.print("Enter the zoo name (not empty): ");
            zooName = scanner.nextLine().trim();
        } while (zooName.isEmpty());

        System.out.println(zooName + " has " + nbrCages + " cages");
    }
}
