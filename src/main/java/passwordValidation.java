public class passwordValidation {

    public static void main(String[] args) {
        System.out.println(containsUpperAndLower("gggGeee"));
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

}
