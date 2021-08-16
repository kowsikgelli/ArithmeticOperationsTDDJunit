import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit Tests For Basic Arithmetic Operations")
class ArithmeticTest {
    private Arithmetic obj;

    @BeforeEach
    void createObject(){obj = new Arithmetic();}

    @Test
    @DisplayName("Add two positive numbers")
    void FourPlusTwoEqualsSix() {
        assertEquals(6, obj.sum(4,2));
    }

    @Test
    @DisplayName("Add two negative numbers")
    void MinusFourPlusMinusTwoEqualsMinusSix(){
        assertEquals(-6,obj.sum(-4,-2));
    }

    @Test
    @DisplayName("Add one negative and positive number")
    void MinusFourPlusTwoEqualsMinusTwo(){
        assertEquals(-2,obj.sum(-4,2));
    }

    @Test
    @DisplayName("Add zero to any number to get same number")
    void ZeroPlusFourEqualsFour(){assertEquals(4,obj.sum(0,4));}

    @Test
    @DisplayName("Subtract Two positive numbers")
    void FourMinusTwoEqualsTwo(){
        assertEquals(2,obj.difference(4,2));
    }

    @Test
    @DisplayName("Subtract one negative and positive number")
    void NegativeFourMinusTwoEqualsNegativeSix(){ assertEquals(-6,obj.difference(-4,2));}

    @Test
    @DisplayName("Subtract two negative numbers")
    void NegativeFourMinusNegativeTwoEqualsNegativeTwo(){
        assertEquals(-2,obj.difference(-4,-2));
    }

    @Test
    @DisplayName("Subtract with zero")
    void ZeroMinusFourEqualsNegativeFour(){assertEquals(-4,obj.difference(0,4));}

    @Test
    @DisplayName("Multiply two postive integers")
    void FourMultiplyTwoEqualsEight(){
        assertEquals(8,obj.multiply(4,2));
    }

    @Test
    @DisplayName("Multiply two negative numbers")
    void NegativeFourMultiplyNegativeTwoEqualsEight(){
        assertEquals(8,obj.multiply(-4,-2));
    }

    @Test
    @DisplayName("Multiply one positive and one negative number")
    void NegativeFourMultiplyTwoEqualsNegativeEight(){
        assertEquals(-8,obj.multiply(-4,2));
    }

    @Test
    @DisplayName("Multiply with zero")
    void ZeroMultiplyFourEqualsZero(){assertEquals(0,obj.multiply(0,4));}

    @Test
    void FourDividedByTwoEqualsTwo(){
        assertEquals(2,obj.divide(4,2));
    }

    @Test
    void FourDividedByNegativeTwoEqualsNegativeTwo(){
        assertEquals(-2,obj.divide(4,-2));
    }

    @Test
    public void FourDividesByZeroEqualsUndefined(){
        assertEquals(Integer.MAX_VALUE,obj.divide(4,0));
    }

}