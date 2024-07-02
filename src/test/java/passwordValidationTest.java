import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidationTest {

    @Test
    public void passwordLength_when8_thenReturnTrue() {
        //Given
        String testPassword = "12345678";
        //When
        boolean acutal = passwordValidation.checkLength(testPassword);
        //Then
        assertTrue(acutal);
    }

    @Test
    public void passwordLength_when5_thenReturnFalse() {
        //Given
        String testPassword = "12345";
        //When
        boolean acutal = passwordValidation.checkLength(testPassword);
        //Then
        assertFalse(acutal);
    }

    @Test
    public void passwordLength_when10_thenReturnTrue() {
        //Given
        String testPassword = "1234567890";
        //When
        boolean acutal = passwordValidation.checkLength(testPassword);
        //Then
        assertTrue(acutal);
    }

    @Test
    public void passwordContainsDigit_when5_thenReturnTrue() {
        //Given
        String testPassword = "HalloTest5";
        //When
        boolean acutal = passwordValidation.containsDigit(testPassword);
        //Then
        assertTrue(acutal);
    }

    @Test
    public void passwordContainsDigit_whenNoDigit_thenReturnFalse() {
        //Given
        String testPassword = "HalloTestYolo";
        //When
        boolean acutal = passwordValidation.containsDigit(testPassword);
        //Then
        assertFalse(acutal);
    }

    @Test
    public void passwordContainsUpperAndLowerCaseLetters_whenLtHalloTest_thenReturnTrue() {
        //Given
        String testPassword = "LtHalloTest";
        //When
        boolean acutal = passwordValidation.containsUpperAndLower(testPassword);
        //Then
        assertTrue(acutal);
    }

    @Test
    public void passwordContainsUpperAndLowerCaseLetters_whengfdsgdgs_thenReturnFalse() {
        //Given
        String testPassword = "gfdsgdgs";
        //When
        boolean acutal = passwordValidation.containsUpperAndLower(testPassword);
        //Then
        assertFalse(acutal);
    }

    @Test
    public void passwordContainsUpperAndLowerCaseLetters_whenJHFGHJJFG_thenReturnFalse() {
        //Given
        String testPassword = "JHFGHJJFG";
        //When
        boolean acutal = passwordValidation.containsUpperAndLower(testPassword);
        //Then
        assertFalse(acutal);
    }

    @Test
    public void checkCommonlyUsedPassword_whenHalloTest12_thenReturnTrue() {
        //Given
        String testPassword = "MicCheck12";
        //When
        boolean actual = passwordValidation.arrayContainsPassword(testPassword);
        //Then
        assertTrue(actual);
    }

    @Test
    public void checkCommonlyUsedPassword_whenPassword1_thenReturnFalse() {
        //Given
        String testPassword = "Password1";
        //When
        boolean actual = passwordValidation.arrayContainsPassword(testPassword);
        //Then
        assertFalse(actual);
    }

    @Test
    public void checkCommonlyUsedPassword_when12345678_thenReturnFalse() {
        //Given
        String testPassword = "12345678";
        //When
        boolean actual = passwordValidation.arrayContainsPassword(testPassword);
        //Then
        assertFalse(actual);
    }
}