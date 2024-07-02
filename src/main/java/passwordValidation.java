import java.util.Random;

public class passwordValidation {

    public static void main(String[] args) {
        String genPassword = passwordGenerator();
        System.out.println("Generated Password: " + genPassword);

    }

    public static boolean checkLength(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        if (password.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }

    public static boolean containsUpperAndLower(String password) {
        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")) {
            return true;
        }
        return false;
    }

    public static boolean arrayContainsPassword(String password) {
        String[] passwordArray = {"Password1", "12345678", "Password", "Test1234", "abcdefg"};

        for (String p : passwordArray) {
            if (password == p) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsSpecialCharacters(String password) {
        String specialChar = "!@#$%^&*()-_=+{}[]\\|;:'\",.<>/?";
        for (char c : password.toCharArray()) {
            if (specialChar.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }

    public static String passwordGenerator() {
        final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lowercase = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String specialChar = "!@#$%^&*()-_=+{}[]\\|;:'\",.<>/?";
        String allChars = uppercase + lowercase + digits + specialChar;

        int min = 8;
        int max = 16;
        int randomLength = (int) (Math.random() * (max - min)) + min;

        StringBuilder password = new StringBuilder(randomLength);
        Random random = new Random();


        password.append(uppercase.charAt(random.nextInt(uppercase.length())));
        password.append(lowercase.charAt(random.nextInt(lowercase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChar.charAt(random.nextInt(specialChar.length())));

        for (int i = 4; i < randomLength; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        StringBuilder shuffledPassword = new StringBuilder(password.length());

        while (!password.isEmpty()) {
            int randomIndex = (int) (Math.random() * password.length());
            shuffledPassword.append(password.charAt(randomIndex));
            password.deleteCharAt(randomIndex);
        }
        return shuffledPassword.toString();
    }
}

