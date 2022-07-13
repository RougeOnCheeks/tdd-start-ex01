package ch05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//테스트 클래스 이름 작성 규칙: Test를 접미사로 붙인다.
public class SumTest {

    //@Test 어노테이션을 붙인 메서드는 private면 안된다.
    @Test
    void sum(){
        int result = 2 + 3;
        assertEquals(5, result);//JUnit의 Assertions 클래스가 제공하는 정적 메서드
    }
}
