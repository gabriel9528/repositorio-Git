import com.exercise.Services.IServicioA;
import com.exercise.Services.Impl.ServicioAImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestServicioA {
   @Test
   public void testSumar(){
        int a = 2;
        int b = 2;
       IServicioA servicioA = new ServicioAImpl();
       Assert.assertEquals(servicioA.sumar(a,b),4);
    }
}