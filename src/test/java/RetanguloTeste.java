import org.example.Retangulo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    static int comp;
    static int larg;
    static int alt;
    static Retangulo ret;

    @BeforeAll
    public static void inicial(){
        ret = new Retangulo();
        comp = 4;
        larg = 6;
        alt = 10;
    }

    @Test
    public void retArea(){
        int area = ret.area(comp,larg);
        assertEquals(area, 8, "calculo da área errado");
    }

    @Test
    public void retPer(){
        Retangulo ret = new Retangulo();
        int comp = 2;
        int larg = 4;
        int perimetro = ret.perimentro(comp,larg);
        assertEquals(perimetro, 12, "calculo do perimetro errado");
    }

    @Test
    public void retTriangulo(){
        int triangulo = ret.isTriangle(comp, larg, alt);
        assertEquals(triangulo, 1, "Não é possivel ser triângulo");
        //1, é possivel ser triangulo
        //0, não é possivel ser triangulo
    }
}
