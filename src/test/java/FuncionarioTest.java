import br.ufjf.model.Funcionario;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FuncionarioTest {

    @Test
    public void calcularSalarioTest(){
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000);
        funcionario.setAdicionalInsalubridade(0.35);

        assertEquals(1350,funcionario.calcularSalario());
    }

}
