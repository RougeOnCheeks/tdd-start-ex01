public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){

        if(s == null || s.isEmpty()) return PasswordStrength.INVALID;

        //metCounts 변수 계산하는 부분 메소드 추출
        int metCounts = getMetCriteriaCounts(s);

        if(metCounts <= 1) return PasswordStrength.WEAK;//조건 1개 충족 시 강도 약함
        if(metCounts == 2) return PasswordStrength.NORMAL;//조건 2개 충족 시 강도 보통
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

    private int getMetCriteriaCounts(String s){
        int metCounts = 0;
        if(s.length() >= 8) metCounts++;
        if(meetsContainingNumberCritera(s)) metCounts++;
        if(meetsContainingUppercaseCritera(s)) metCounts++;

        return metCounts;
    }
}
