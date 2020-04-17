package es.fpdual.testing;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class HolaMundoTest {

    @Test
    public void deberiaDevolverLaCadenaHolaMundo() throws Exception {
        // Incialización
        final HolaMundo holaMundo = new HolaMundo();

        // Entrenamiento

        // Prueba
        final String test = holaMundo.getHolaMundo();

        // Comprobación
        assertThat(test, is("HOLA MUNDO"));
    }

    @Test
    public void deberiaRetornarConcatenadaLaCadenaPasadaPorParametro() throws Exception {
        final String parametro1 = "parametro1";
        final HolaMundo holaMundo = new HolaMundo(parametro1);
        assertThat(holaMundo.getHolaMundo(), is("HOLA MUNDO: parametro1"));
    }

    @Test
    public void deberiaDevolverLaCadenaHolaMundoCuandoElParametroEsNulo() throws Exception {
        // Incialización
        final HolaMundo holaMundo = new HolaMundo(null);

        // Entrenamiento

        // Prueba
        final String test = holaMundo.getHolaMundo();

        // Comprobación
        assertThat(test, is("HOLA MUNDO"));
    }
}
