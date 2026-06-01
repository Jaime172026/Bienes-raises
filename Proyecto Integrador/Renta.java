public class Renta {
    private int idRenta;
    private String fechaInicio;
    private String fechaFin;
    private double valorMensual;
    private String estado;

    public Renta() {}


    public Renta(int idRenta, String fechaInicio, String fechaFin, double valorMensual, String estado) {
        this.idRenta = idRenta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorMensual = valorMensual;
        this.estado = estado;
    }

    public void generarContrato() {
        System.out.println("Contrato Digitalizado: Renta generada con éxito. Vigencia desde " + fechaInicio + " hasta " + fechaFin + " por un canon mensual de $" + valorMensual + ".");
    }

   
    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(double valorMensual) {
        this.valorMensual = valorMensual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}