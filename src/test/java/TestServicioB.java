import com.exercise.Services.IServicioB;
import com.exercise.Services.Impl.ServicioBImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestServicioB {

    @Test
    public void testMultiplicar(){
        IServicioB iServicioB = new ServicioBImpl();
        Assert.assertEquals(iServicioB.multiplicar(2,3),6);
    }
}
