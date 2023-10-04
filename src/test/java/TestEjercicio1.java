import org.example.Pila;
import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio1 {
    @Test
    public void TestPila(){
    Pila p = new Pila();
    p.anadir(2);
    p.anadir("Hola");
    p.anadir(true);
        Assert.assertEquals(2, p.extraer());
        Assert.assertEquals("Hola", p.primero());
    p.extraer();
    p.extraer();
        Assert.assertEquals(true, p.estaVacia());
    }
}
