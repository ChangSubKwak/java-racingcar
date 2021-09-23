import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import org.assertj.core.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @DisplayName("1,2를 문자열로 입력받아 spilt로 분리하면면 1과 2 문자열로 분리된다")
    @Test
    void splitTest1() {
        assertThat("1,2".split(",")).containsExactly("1","2");
    }

    @Test
    void exceptionTest1() {
        //assertThat("1,2".split(",")).containsExactly("1","2");
        assertThatThrownBy(() -> {
            new Integer(1/0);
        }).isInstanceOf(ArithmeticException.class);
    }
    //요구사항2
    @Test
    void substringTest() {
        String a = "(1,2)";

        int target = a.indexOf("(");
        int target2 = a.indexOf(")");

        String b = a.substring(target+1, target2);
        System.out.println("b = " + b);
    }

    //요구사항3
    @Test
    void charAtTest(){
        String test = "abc";
        char a = test.charAt(1);
        System.out.println("a = " + a);
    }

    @DisplayName("문자열 abc에 대해 charAt메서드를 사용하여 범위가벗어나게 index를 설정 하면 StringIndexOutOfBoundsException이 발생된다")
    @Test
    void charAtExceptionTest(){
        String ex = "abc";

        assertThatThrownBy(()->{
            ex.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }

}
