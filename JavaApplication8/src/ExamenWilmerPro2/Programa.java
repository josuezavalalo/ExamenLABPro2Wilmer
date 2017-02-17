package ExamenWilmerPro2;

public class Programa {

    private String nombre;
    private int edad;
    private int identidad;
    private int idlote;
    private String departamento;
    private int dinero;

    public Programa() {
    }

    public Programa(String nombre, int edad, int identidad, int idlote, String departamento, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.idlote = idlote;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public int getIdlote() {
        return idlote;
    }

    public void setIdlote(int idlote) {
        this.idlote = idlote;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Programa{" + "nombre=" + nombre + ", edad=" + edad + ", identidad=" + identidad + ", idlote=" + idlote + ", departamento=" + departamento + ", dinero=" + dinero + '}';
    }
    
    
}
