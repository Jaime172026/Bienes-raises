public class EvaluacionMadurezDigital {
    private int idEvaluacion;
    private String fechaEvaluacion;
    private double puntajeCRM;
    private double puntajeMarketingDigital;
    private double puntajeAutomatizacion;
    private double puntajeFirmaElectronica;


    public EvaluacionMadurezDigital() {}


    public EvaluacionMadurezDigital(int idEvaluacion, String fechaEvaluacion, double puntajeCRM, double puntajeMarketingDigital, double puntajeAutomatizacion, double puntajeFirmaElectronica) {
        this.idEvaluacion = idEvaluacion;
        this.fechaEvaluacion = fechaEvaluacion;
        this.puntajeCRM = puntajeCRM;
        this.puntajeMarketingDigital = puntajeMarketingDigital;
        this.puntajeAutomatizacion = puntajeAutomatizacion;
        this.puntajeFirmaElectronica = puntajeFirmaElectronica;
    }


    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(String fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public double getPuntajeCRM() {
        return puntajeCRM;
    }

    public void setPuntajeCRM(double puntajeCRM) {
        this.puntajeCRM = puntajeCRM;
    }

    public double getPuntajeMarketingDigital() {
        return puntajeMarketingDigital;
    }

    public void setPuntajeMarketingDigital(double puntajeMarketingDigital) {
        this.puntajeMarketingDigital = puntajeMarketingDigital;
    }

    public double getPuntajeAutomatizacion() {
        return puntajeAutomatizacion;
    }

    public void setPuntajeAutomatizacion(double puntajeAutomatizacion) {
        this.puntajeAutomatizacion = puntajeAutomatizacion;
    }

    public double getPuntajeFirmaElectronica() {
        return puntajeFirmaElectronica;
    }

    public void setPuntajeFirmaElectronica(double puntajeFirmaElectronica) {
        this.puntajeFirmaElectronica = puntajeFirmaElectronica;
    }

    public double calcularPromedio() {
        return (puntajeCRM + puntajeMarketingDigital + puntajeAutomatizacion + puntajeFirmaElectronica) / 4;
    }

    public String obtenerNivelMadurezDigital() {
        double promedio = calcularPromedio();
        if (promedio >= 80) {
            return "Alto - Nivel PropTech Avanzado (Procesos optimizados digitalmente)";
        } else if (promedio >= 50) {
            return "Medio - En proceso de Transformación (Herramientas activas, falta integración)";
        } else {
            return "Bajo - Tradicional (Requiere Digitalización Urgente)";
        }
    }
}