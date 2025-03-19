public class Empleado extends Persona {
    private String tipoContratacion; // Permanente o Outsourcing

    public Empleado(int id, String nombre, String documentoIdentidad, String tipoPersona,
                    String telefono, String correo, String direccion, String estado,
                    String tipoContratacion) {
        super(id, nombre, documentoIdentidad, tipoPersona, telefono, correo, direccion, estado);
        this.tipoContratacion = tipoContratacion;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Tipo de Contratación: " + tipoContratacion;
    }

    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }
}
