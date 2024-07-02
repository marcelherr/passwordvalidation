public class passwordValidation {

    public static void main(String[] args) {
        System.out.println(containsUpperAndLower("gggGeee"));
        System.out.println(containsSpecialCharacters("MicCheck12"));
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
        String[] passwordArray = {"Password1", "12345678", "Password", "Test1234"};

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


}
