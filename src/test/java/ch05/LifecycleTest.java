package ch05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleTest {
    public LifecycleTest(){
        System.out.println("new LifecycleTest"); //1, 5
    }

    @BeforeEach //테스트를 실행하는데 필요한 준비작업을 할때 사용:
                //테스트에서 사용할 임시파일 생성, 테스트 메서드에서 사용할 객체 생성 등
    void setUp(){ //private 이면 안된다.
        System.out.println("setUp");//2, 6
    }

    @Test
    void a(){
        System.out.println("A");//3
    }

    @Test
    void b(){
        System.out.println("B");//7
    }

    @AfterEach //테스트를 실행한 후에 정리할 것이 있을 때 사용
                //테스트에서 사용한 임시 파일 삭제 등
    void tearDown(){ //private 이면 안된다.
        System.out.println("tearDown");//4, 8
    }
}
