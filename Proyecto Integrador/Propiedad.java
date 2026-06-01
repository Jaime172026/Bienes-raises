public class Propiedad {
    private int idPropiedad;
    private String titulo;
    private String descripcion;
    private double precio;
    private String ubicacion;
    private String tipo; 
    private String estado; 

  
    public Propiedad() {}

    public Propiedad(int idPropiedad, String titulo, String descripcion, double precio, String ubicacion, String tipo, String estado) {
        this.idPropiedad = idPropiedad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.estado = estado;
    }

  
    public void mostrarInformacion() {
        System.out.println("Ficha Propiedad -> Título: " + titulo + " | Tipo: " + tipo + " | Ubicación: " + ubicacion + " | Precio: $" + precio);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Actualización del Sistema: La propiedad '" + this.titulo + "' ha cambiado su estado a " + this.estado + ".");
    }

   
    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}