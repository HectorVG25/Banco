import java.time.LocalDate;

public class Cliente {

    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private LocalDate fechaNacimiento;

    // Constructor mínimo
    public Cliente(String dni) {
        this.dni = dni;
    }

    // Constructor completo
    public Cliente(String dni, String nombre, String apellidos, String direccion, String localidad,
            LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos de conveniencia (Mejorados para evitar imprimir "null")
    public String nombreCompleto() {
        return nombre + " " +apellidos;
    }

    public String direccionCompleta() {
        String d = (direccion != null) ? direccion : "";
        String l = (localidad != null) ? localidad : "";
        
        if (d.isEmpty() && l.isEmpty()) return "";
        if (d.isEmpty()) return l;
        if (l.isEmpty()) return d;
        return d + ", " + l;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método toString para imprimir el objeto fácilmente
    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombreCompleto='" + nombreCompleto() + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}