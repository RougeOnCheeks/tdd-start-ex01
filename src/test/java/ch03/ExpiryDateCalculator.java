package ch03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(LocalDate billingDate, int payAmount){
        //return LocalDate.of(2022,8,1);
        return billingDate.plusMonths(1);
    }
}
