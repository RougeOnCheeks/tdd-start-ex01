package ch03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨(){
        LocalDate billingDate = LocalDate.of(2022,7,1);
        int payAmount = 10_000;

        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);

        assertEquals(LocalDate.of(2022,8,1), expiryDate);

        //동일조건 예시 추가
        LocalDate billingDate2 = LocalDate.of(2022,7,5);
        int payAmount2 = 10_000;

        ExpiryDateCalculator cal2 = new ExpiryDateCalculator();
        LocalDate expiryDate2 = cal.calculateExpiryDate(billingDate2, payAmount);

        assertEquals(LocalDate.of(2022,8,5), expiryDate2);

    }
}
