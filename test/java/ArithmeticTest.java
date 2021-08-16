import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit Tests For Basic Arithmetic Operations")
class ArithmeticTest {
    private Arithmetic obj;
    @BeforeEach
    void createObject(){
        obj = new Arithmetic();
    }
    @Test
    @DisplayName("Add two positive numbers")
    void toAddFourAndTwo() {
        assertEquals(6, obj.sum(4,2));
    }

    @Test
    @DisplayName("Add two negative numbers")
    void toAddMinusFourAndMinusTwo(){
        assertEquals(-6,obj.sum(-4,-2));
    }

    @Test
    @DisplayName("Add one negative and positive number")
    void toAddMinusFourAndTwo(){
        assertEquals(-2,obj.sum(-4,2));
    }

    @Test
    @DisplayName("Add zero to any number to get same number")
    void toAddZeroAndFour(){assertEquals(4,obj.sum(0,4));}

    @Test
    @DisplayName("Subtract Two positive numbers")
    void toSubtractFourAndTwo(){
        assertEquals(2,obj.difference(4,2));
    }

    @Test
    @DisplayName("Subtract one negative and positive number")
    void toSubtractMinusFourAndTwo(){
        assertEquals(-6,obj.difference(-4,2));
    }

    @Test
    @DisplayName("Subtract two negative numbers")
    void toSubtractMinusFourAndMinusTwo(){
        assertEquals(-2,obj.difference(-4,-2));
    }

    @Test
    @DisplayName("Subtract with zero")
    void toSubtractZeroWithFour(){assertEquals(-4,obj.difference(0,4));}

    @Test
    @DisplayName("Multiply two postive integers")
    void toMultiplyFourAndTwo(){
        assertEquals(8,obj.multiply(4,2));
    }

    @Test
    @DisplayName("Multiply two negative numbers")
    void toMultiplyMinusFourMinusTwo(){
        assertEquals(8,obj.multiply(-4,-2));
    }

    @Test
    @DisplayName("Multiply one positive and one negative number")
    void toMultiplyMinusFourTwo(){
        assertEquals(-8,obj.multiply(-4,2));
    }

    @Test
    @DisplayName("Multiply with zero")
    void toMultiplyZeroWithFour(){assertEquals(0,obj.multiply(0,4));}

    @Test
    void toDivideFourWithTwo(){
        assertEquals(2,obj.divide(4,2));
    }

    @Test
    void toDivideFourWithMinusTwo(){
        assertEquals(-2,obj.divide(4,-2));
    }

    @Test
    public void toDivideFourWithZero(){
        try{
            obj.divide(4,0);
            fail("expected to throw Arithmetic Exception");
        }catch(ArithmeticException e){
            assertEquals(e.getMessage(),"Division by zero not supported");
        }
    }

}