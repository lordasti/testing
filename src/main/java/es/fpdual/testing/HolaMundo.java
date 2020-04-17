package es.fpdual.testing;

import org.apache.commons.lang3.*;

public class HolaMundo {

    private static String HOLA_MUNDO = "HOLA MUNDO";

    private String parametro;

    public HolaMundo() {
        this("");
    }

    public HolaMundo(String parametro) {
        this.parametro = parametro;
    }

    public String getHolaMundo() throws ClassNotFoundException {
        return StringUtils.isEmpty(this.parametro) ? HOLA_MUNDO : HOLA_MUNDO + ": " + this.parametro;
    }

}
