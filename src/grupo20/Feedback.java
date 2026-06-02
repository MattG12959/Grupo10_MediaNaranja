package grupo20;

public class Feedback {
    
    private boolean esPositivo;
    private String detalles;
    private String comentarioAdicional;


    public Feedback(boolean esPositivo, String detalles, String comentarioAdicional) {
        this.esPositivo = esPositivo;
        this.detalles = detalles;
        this.comentarioAdicional = comentarioAdicional;
    }


public Feedback() {
        this.esPositivo = false;
        this.detalles = "Baja automática por inactividad del mes.";
        this.comentarioAdicional = "Ninguno (Sistema).";
    }

    public boolean isEsPositivo() {
        return esPositivo;
    }

    public void setEsPositivo(boolean esPositivo) {
        this.esPositivo = esPositivo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getComentarioAdicional() {
        return comentarioAdicional;
    }

    public void setComentarioAdicional(String comentarioAdicional) {
        this.comentarioAdicional = comentarioAdicional;
    }

   @Override
    public String toString() {
        return "Feedback [Positivo=" + esPositivo + ", Detalles=" + detalles + "]";
    }
}