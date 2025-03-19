public class Cliente extends Persona {
    private String creadoPor;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String fechaInactivacion;

    public Cliente(int id, String nombre, String documentoIdentidad, String tipoPersona,
                   String telefono, String correo, String direccion, String estado,
                   String creadoPor, String fechaCreacion) {
        super(id, nombre, documentoIdentidad, tipoPersona, telefono, correo, direccion, estado);
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
    }

    public void actualizarCliente(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.fechaActualizacion = java.time.LocalDate.now().toString();
    }

    public void inactivarCliente() {
        this.estado = "Inactivo";
        this.fechaInactivacion = java.time.LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Estado: " + estado +
                ", Creado por: " + creadoPor + ", Fecha de Creación: " + fechaCreacion;
    }

    public String getcreadoPor() {
        return creadoPor;
    }

    public void setcreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getfechaCreacion() {
        return fechaCreacion;
    }

    public void setfechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getfechaActualizacion() {
        return fechaActualizacion;
    }

    public void setfechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getfechaInactivacion() {
        return fechaInactivacion;
    }

    public void setfechaInactivacion(String fechaInactivacion) {
        this.fechaInactivacion = fechaInactivacion;
    }
}
