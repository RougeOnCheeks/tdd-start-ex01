public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        //return PasswordStrength.STRONG;
        //return PasswordStrength.NORMAL;//두번째 테스트만 통과
        if(s.length() < 8){
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }
}
