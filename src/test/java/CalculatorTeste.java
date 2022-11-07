import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTeste {

    @Test //@ é uma anotation
    public void testSoma() {
        Calculator calculo = new Calculator();
        double soma = calculo.soma(2, 5);
        double testSoma = 7;
        assertEquals(soma, testSoma, "Erro no cálculo da soma");

    }
}
