public class passwordValidation {
    public static void main(String[] args) {
        System.out.println("Enter password");
    }

    public static boolean checkLength(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

}
