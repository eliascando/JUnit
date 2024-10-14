import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {

    @Test
    public void testCalcularArea() {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        int resultado = rectangulo.calcularArea();
        assertEquals(50, resultado, "El área de un rectángulo de 5x10 debería ser 50");
    }
}