import java.util.Scanner;
public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;

        do {
            System.out.println("Introdu username");
            // System.out.println("Username-ul nu trebuie sa contina spatii");
            username = scanner.nextLine();

            if (username.contains(" ")) {
                System.out.println("Eroare: Username-ul nu trebuie sa contina spatii");
                continue;
            }

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: username-ul trebuie sa contina intre 6 si 12 caractere");
                continue;
            }

            boolean hasDigit = false;
            for (char c : username.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                System.out.println("Eroare: username-ul trebuie sa aiba cel putin o cifra");
                continue;
            }


            System.out.println("Username accepted" + username);
            break;
        } while (true);
        scanner.close();

    }
}

