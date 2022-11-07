import org.example.QuantDig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuantDigTest {
    static String txt;
    QuantDig num;
    @BeforeEach
    public void setup(){
        txt = "1234";
        num = new QuantDig();
    }

    @Test
    public void calcular(){
        int sum = num.calculo(txt);
        assertEquals(10, sum, "A soma não está correta");
    }

    @Test
    public void comp(){
        int compr = num.comprimento(txt);
        assertEquals(4, compr, "O comprimento não está correto");
    }
}
