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
}
