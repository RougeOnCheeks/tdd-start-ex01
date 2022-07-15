package ch03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(PayData payData){
        //return LocalDate.of(2022,8,1);
        //return billingDate.plusMonths(1);
        return payData.getBillingDate().plusMonths(1);
    }
}
