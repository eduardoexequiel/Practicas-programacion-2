import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class empleado {

    private String dni;
    private String nombre;
    private  String apellido;
    private String domicilio;
    private String fechaDeNacimiento;
    private double sueldoBruto;

    public empleado(String dni, String nombre, String apellido, String domicilio, String fechaDeNacimiento, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBruto = sueldoBruto;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int calcular_edad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(this.fechaDeNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        return fechaNacimiento.until(fechaActual).getYears();
    }

    public void mostrar_datos() {
        System.out.println("Empleado:");
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Domicilio: " + this.domicilio);
        System.out.println("Fecha de Nacimiento: " + this.fechaDeNacimiento);
        System.out.println("Sueldo Bruto: " + this.sueldoBruto);
    }

}

