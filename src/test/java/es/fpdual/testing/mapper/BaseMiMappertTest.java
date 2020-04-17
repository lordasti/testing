package es.fpdual.testing.mapper;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;

@Transactional("testingTransactionManager")
public abstract class BaseMiMappertTest {

    @Autowired
    private MiMapper mapper;

    @Test
    public void deberiaDevolver0Documentos() throws Exception {
        // Inicializacion

        // Entrenamiento

        // Prueba
        final int numeroElementos = this.mapper.getNumeroElementos();

        // Comprobación
        assertThat(numeroElementos, is(0));
    }

}
