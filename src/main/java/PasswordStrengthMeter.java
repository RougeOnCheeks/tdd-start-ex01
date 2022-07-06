public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        //return PasswordStrength.STRONG;
        //return PasswordStrength.NORMAL;//두번째 테스트만 통과
        if(s == null || s.isEmpty()) return PasswordStrength.INVALID;
        if(s.length() < 8){
            return PasswordStrength.NORMAL;
        }
//        boolean containsNum = false;
//        //각 문자를 비교해서 0~9 사이의 값을 갖는 문자가 있으면 true로 바꾸고 break, 없으면 NORMAL 리턴
//        for(char ch: s.toCharArray()){
//            if (ch >= '0' && ch <= '9') {
//                containsNum = true;
//                break;
//            }
//        }

        boolean containsNum = meetsContainingNumberCritera(s);

        if(!containsNum) return PasswordStrength.NORMAL;

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
}
