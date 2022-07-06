public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        //return PasswordStrength.STRONG;
        //return PasswordStrength.NORMAL;//두번째 테스트만 통과
        if(s == null || s.isEmpty()) return PasswordStrength.INVALID;
        if(s.length() < 8){
            return PasswordStrength.NORMAL;
        }

        boolean containsNum = meetsContainingNumberCritera(s);
        if(!containsNum) return PasswordStrength.NORMAL;

        boolean containsUpp = meetsContainingUppercaseCritera(s);
        if(!containsUpp) return PasswordStrength.NORMAL;

        return PasswordStrength.STRONG;
    }

    private boolean meetsContainingNumberCritera(String s){
        for(char ch: s.toCharArray()){
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }

    private boolean meetsContainingUppercaseCritera(String s){
        for(char ch: s.toCharArray()){
            if(Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }
}
