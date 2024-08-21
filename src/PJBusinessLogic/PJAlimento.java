package PJBusinessLogic;

public abstract class PJAlimento {
    protected String tipo;
    @Override
    public String toString() {
        if(tipo == null)
            tipo = "";
        return tipo.toUpperCase();
    }
}
