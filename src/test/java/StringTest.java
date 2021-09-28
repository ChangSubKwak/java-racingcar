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
        
        assertThatThrownBy(() -> {
            new Integer(1/0);
        }).isInstanceOf(ArithmeticException.class);
    }
    //요구사항2
    @DisplayName("substring을 이용하여 지정한 문자열을 삭제후 나머지 문자열을 출력한다")
    @Test
    void substringTest() {
        String beforeText = "(1,2)";

        int indexOfLeftBracket  = beforeText.indexOf("(");
        int indexOfRightBracket  = beforeText.indexOf(")");

        String afterText = beforeText.substring(indexOfLeftBracket +1, indexOfRightBracket );
        assertThat(afterText.equals("1,2"));
    }

    //요구사항3
    @DisplayName("charAt()을 이용하여 문자열 abc 의 두번째 인덱스에 해당하는 값 b를 비교하면 정삭적으로 통과된다")
    @Test
    void charAtTest(){

        assertThat("abc".charAt(1)).isEqualTo('b');
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
