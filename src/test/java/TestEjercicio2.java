import org.example.Matriz;
import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio2 {
    @Test
    public void TestMatriz(){
        Matriz m = new Matriz(5,5);
        m.set(0, 0, 'b');
        m.set(0,1, 23);
        m.set(0,2, true);
        m.set(0,3, "Hola");
        Assert.assertEquals('b', m.get(0,0));
        Assert.assertEquals(null, m.get(1,1));
        Assert.assertEquals(5, m.filas());
        Assert.assertEquals(5, m.columnas());
    }
}
