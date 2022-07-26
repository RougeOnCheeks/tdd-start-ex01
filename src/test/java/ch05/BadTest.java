package ch05;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

//public class BadTest {
//    private FileOperator op = new FileOperator();
//    private static File file; //정적 필드로 정의: 테스트 메서드를 실행할 때 마다 객체를 새로 생성하므로
//
//    @Test
//    void fileCreationTest(){
//        File createdFile = op.createFile();
//        assertTrue(createdFile.length() > 0);
//        this.file = createdFile;
//    }
//
//    @Test
//    void readFileTest(){
//        long data = op.readData(file);
//        assertTrue(data > 0);
//    }
//    //원하는 순서대로 테스트 메서드가 실행되지 않으면 file 필드가 null이 되어 테스트에 실패하게 됨
//    //따라서 각 테스트 메서드는 서로 독립적으로 동작해야 한다.
//    //테스트 메서드가 서로 필드를 공유하거나, 실행 순서를 가정하고 테스트를 작성하지 말아야 한다.
//}
