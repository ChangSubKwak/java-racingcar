import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    //요구사항1
    @DisplayName("numbers를 size()메서드로 확인하면 중복값이 제거된 3개의 size로 출력되는것이 확인된다")
    @Test
    void sizeTest(){

        assertThat(numbers.size()).isEqualTo(3);

    }

    //요구사항2
    @DisplayName("contains메서드로 numbers안에 있는 1,2,3 그리고 numbers안에 없는4 로 확인하면 1,2,3은 True, 4는 false 로 통과하는것이 확인된다")
    @Test
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
        assertThat(numbers.contains(4)).isFalse();
    }

    //중복소스 없애기
    @DisplayName("ParameterizedTest를 이용하면 테스트할 값을ValueSource에 입력하여 중복소스 없이 ValueSource준 값들을 차례로 테스트하여 비교된다")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void containTest(int input){

        assertTrue(numbers.contains(input));
    }

    //요구사항3
    @DisplayName("CsvSource를 이용하여 벨류값을 1,2,3,4,5 를주어 각각 numbers의 값과 비교하면 1,2,3은 true, 4,5는 false로 떨어지는것을 알수있다.")
    @ParameterizedTest
    @CsvSource(value = {"true:1","true:2","true:3","false:4","false:5"},delimiter = ':')

      void csvSourceTest(String trueORfalse, Integer number){
        if(trueORfalse == "true"){
            assertTrue(numbers.contains(number));
        }else if(trueORfalse == "false"){
            assertFalse(numbers.contains(number));
        }

    }


}