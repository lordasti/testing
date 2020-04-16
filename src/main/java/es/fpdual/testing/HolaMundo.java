package es.fpdual.testing;

public class HolaMundo {

    private static String HOLA_MUNDO = "HOLA MUNDO";

    private String parametro;

    public HolaMundo() {
        this("");
    }

    public HolaMundo(String parametro) {
        this.parametro = parametro;
    }

    public String getHolaMundo() {
        return "".equals(this.parametro) ? HOLA_MUNDO : HOLA_MUNDO + ": " + this.parametro;
    }

    public String getHolaMundo(String parametro1) {
        return HOLA_MUNDO + ": " + parametro1;
    }

}
