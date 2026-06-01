public class Venta {
    private int idVenta;
    private String fechaVenta;
    private double monto;
    private String estado;

   
    public Venta() {}

  
    public Venta(int idVenta, String fechaVenta, double monto, String estado) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.monto = monto;
        this.estado = estado;
    }

 
    public void generarVenta() {
        System.out.println("Transacción: Venta registrada con ID " + idVenta + " el " + fechaVenta + ". Monto total liquidado: $" + monto + ". Estado: " + estado + ".");
    }

   
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}