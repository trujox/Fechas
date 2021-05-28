
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Fran
 */
@RunWith(value = org.junit.runners.Parameterized.class)
public class FechasParametrizedTest {
    
    int resultado;
    String fechaFactura;
    
    public FechasParametrizedTest(int resultado, String fechaFactura) {
        this.resultado = resultado;
        this.fechaFactura = fechaFactura;
    }

    /**
     * Test of ingreso method, of class Monto.
     */
    @Parameters
    public static Iterable<Object[]> getdata(){
        List<Object[]> obj = new ArrayList<>();
        
        obj.add(new Object[]{0, });
        obj.add(new Object[]{1, });
        obj.add(new Object[]{-1, });
        obj.add(new Object[]{0, });
        obj.add(new Object[]{1, });
        obj.add(new Object[]{-1, });
        return obj;
    }

}