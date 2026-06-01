public class IndicadorDigital {
    private int idIndicador;
    private String nombre;
    private String descripcion;
    private double valorActual;
    private double valorObjetivo;
    private String areaRelacionada;

    public IndicadorDigital() {}

    public IndicadorDigital(int idIndicador, String nombre, String descripcion, double valorActual, double valorObjetivo, String areaRelacionada) {
        this.idIndicador = idIndicador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorActual = valorActual;
        this.valorObjetivo = valorObjetivo;
        this.areaRelacionada = areaRelacionada;
    }

  
    public boolean estaCumplido() {
        return valorActual >= valorObjetivo;
    }


    public void mostrarEstadoIndicador() {
        String estado = estaCumplido() ? "CUMPLIDO" : "NO CUMPLIDO";
        System.out.println("Métrica -> KPI: " + nombre + " | Área: " + areaRelacionada + " | Estado: [" + estado + "] (" + valorActual + "% / Objetivo: " + valorObjetivo + "%)");
    }


    public int getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public String getAreaRelacionada() {
        return areaRelacionada;
    }

    public void setAreaRelacionada(String areaRelacionada) {
        this.areaRelacionada = areaRelacionada;
    }
}