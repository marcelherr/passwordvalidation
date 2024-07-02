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


}