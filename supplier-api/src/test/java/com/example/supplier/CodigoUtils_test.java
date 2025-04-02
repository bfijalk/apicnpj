package com.example.supplier;

import com.example.supplier.util.CodigoUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SupplierApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void isValidCNPJ_ShouldReturnTrueForValidCNPJ() {
        long validCNPJ = 12345678000195L; // Example valid CNPJ
        assertTrue(CodigoUtil.isValidCNPJ(validCNPJ), "Expected valid CNPJ to return true");
    }

    @Test
    void isValidCNPJ_ShouldReturnFalseForInvalidCNPJ() {
        long invalidCNPJ = 12345678000194L; // Example invalid CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(invalidCNPJ), "Expected invalid CNPJ to return false");
    }

    @Test
    void isValidCNPJ_ShouldReturnFalseForShortCNPJ() {
        long shortCNPJ = 12345678L; // Example short CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(shortCNPJ), "Expected short CNPJ to return false");
    }

    @Test
    void isValidCNPJ_ShouldReturnFalseForLongCNPJ() {
        long longCNPJ = 123456789012345L; // Example long CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(longCNPJ), "Expected long CNPJ to return false");
    }

    @Test
    void isValidCNPJ_ShouldReturnFalseForNonNumericCNPJ() {
        long nonNumericCNPJ = -12345678000195L; // Example non-numeric CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(nonNumericCNPJ), "Expected non-numeric CNPJ to return false");
    }

    @Test
    void isValidCNPJ_ShouldHandleEdgeCaseWithZeroCNPJ() {
        long zeroCNPJ = 0L; // Edge case with zero CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(zeroCNPJ), "Expected zero CNPJ to return false");
    }

    @Test
    void isValidCNPJ_ShouldHandleEdgeCaseWithMaxLongValue() {
        long maxLongCNPJ = Long.MAX_VALUE; // Edge case with max long value
        assertFalse(CodigoUtil.isValidCNPJ(maxLongCNPJ), "Expected max long value CNPJ to return false");
    }
}
import com.example.supplier.util.CodigoUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CodigoUtilTest {

    @Test
    public void isValidCNPJ_ShouldReturnTrueForValidCNPJ() {
        long validCNPJ = 12345678000195L; // Example of a valid CNPJ
        assertTrue(CodigoUtil.isValidCNPJ(validCNPJ), "Expected valid CNPJ to return true");
    }

    @Test
    public void isValidCNPJ_ShouldReturnFalseForInvalidCNPJ() {
        long invalidCNPJ = 12345678000194L; // Example of an invalid CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(invalidCNPJ), "Expected invalid CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldReturnFalseForShortCNPJ() {
        long shortCNPJ = 12345678L; // Example of a CNPJ shorter than 14 digits
        assertFalse(CodigoUtil.isValidCNPJ(shortCNPJ), "Expected short CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldReturnFalseForLongCNPJ() {
        long longCNPJ = 123456789012345L; // Example of a CNPJ longer than 14 digits
        assertFalse(CodigoUtil.isValidCNPJ(longCNPJ), "Expected long CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldReturnFalseForNonNumericCNPJ() {
        long nonNumericCNPJ = -12345678000195L; // Example of a negative CNPJ
        assertFalse(CodigoUtil.isValidCNPJ(nonNumericCNPJ), "Expected non-numeric CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldHandleEdgeCaseWithZeroCNPJ() {
        long zeroCNPJ = 0L; // Example of a CNPJ with all zeros
        assertFalse(CodigoUtil.isValidCNPJ(zeroCNPJ), "Expected zero CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldHandleEdgeCaseWithMaxLongValue() {
        long maxLongCNPJ = Long.MAX_VALUE; // Example of a CNPJ with maximum long value
        assertFalse(CodigoUtil.isValidCNPJ(maxLongCNPJ), "Expected max long CNPJ to return false");
    }

    @Test
    public void isValidCNPJ_ShouldHandleEdgeCaseWithMinLongValue() {
        long minLongCNPJ = Long.MIN_VALUE; // Example of a CNPJ with minimum long value
        assertFalse(CodigoUtil.isValidCNPJ(minLongCNPJ), "Expected min long CNPJ to return false");
    }
}
