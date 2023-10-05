import org.example.ListaOrdenada;
import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio3 {
    @Test
    public void testListaOrdenada(){
        ListaOrdenada lo = new ListaOrdenada();
        lo.add("maven");
        lo.add("java");
        lo.add("");
        lo.add("Hola");



        Assert.assertEquals("" , lo.get(0));
        Assert.assertEquals("Hola", lo.get(1));
        Assert.assertEquals(4, lo.size());
        Assert.assertFalse(lo.isEmpty());


    }
}
