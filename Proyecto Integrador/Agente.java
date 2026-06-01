public class Agente {
    private int idAgente;
    private String nombre;
    private String telefono;
    private String correo;
    private String especialidad;


    public Agente() {}

  
    public Agente(int idAgente, String nombre, String telefono, String correo, String especialidad) {
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
    }


    
    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
     public void gestionarCliente(Cliente cliente) {
        System.out.println("Asignación: El agente " + this.nombre + " (Especialidad: " + this.especialidad + ") ha iniciado el seguimiento del cliente " + cliente.getNombre() + " " + cliente.getApellido() + ".");
    }
}