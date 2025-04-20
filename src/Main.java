import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("=====================================");
            System.out.println("     ENKRIPTIM / DEKRIPTIM TEKSTI    ");
            System.out.println("=====================================");
            System.out.println("Zgjidh një opsion:");
            System.out.println("1. Enkripto tekstin");
            System.out.println("2. Dekripto tekstin");
            System.out.println("3. Brute-force decrypt");
            System.out.println("0. Dil");
            System.out.println();
            System.out.print("Zgjedhja: ");

            int zgjedhja = scanner.nextInt();
            scanner.nextLine();

            switch (zgjedhja) {
                case 1:
                    System.out.print("Shkruaj tekstin për enkriptim: ");
                    String tekstEnkriptim = scanner.nextLine();

                    System.out.print("Shkruaj vlerën e shift (0–25): ");
                    int shiftE = scanner.nextInt();

                    String encrypted = Enkriptimi.encrypt(tekstEnkriptim, shiftE);
                    System.out.println();
                    System.out.println("Teksti i enkriptuar: " + encrypted);
                    break;

                case 2:
                    System.out.print("Shkruaj tekstin për dekriptim: ");
                    String tekstDekriptim = scanner.nextLine();

                    System.out.print("Shkruaj vlerën e shift (0–25): ");
                    int shiftD = scanner.nextInt();

                    long startTime = System.nanoTime();
                    String decrypted = Dekriptimi.decrypt(tekstDekriptim, shiftD);
                    long endTime = System.nanoTime();

                    long duration = (endTime - startTime);
                    System.out.println();
                    System.out.println("Teksti i dekriptuar: " + decrypted);
                    System.out.println("Koha e dekriptimit: " + duration + " nanosekonda.");
                    break;

                case 3:
                    System.out.print("Shkruaj tekstin për brute-force decrypt: ");
                    String tekstBF = scanner.nextLine();

                    Dekriptimi.bruteForceDecrypt(tekstBF);
                    break;

                case 0:
                    System.out.println("Dalje nga programi. Mirupafshim!");
                    return;

                default:
                    System.out.println("Zgjedhje e pavlefshme. Provo përsëri.");
            }
            System.out.println();
        }
    }
}
