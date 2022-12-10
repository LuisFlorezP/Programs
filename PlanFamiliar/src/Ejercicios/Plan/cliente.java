
package Ejercicios.Plan;

public class cliente {   
    private String nombre;
    private String doc;
    private int edad;
    private char categoria;
    private int mayores;
    private int menores;
    private String vehiculo;
    
    public cliente(String nombre, String doc, int edad, char categoria, int mayores, int menores, String vehiculo) {
        this.nombre = nombre;
        this.doc = doc;
        this.edad = edad;
        this.categoria = categoria;
        this.mayores = mayores;
        this.menores = menores;
        this.vehiculo = vehiculo;
    }
    
    public String getNombre() {
        return (nombre);
    }
    
    public String getDoc() {
        return (doc);
    }
    
    public int getEdad() {
        return (edad);
    }
    
    public char getCategoria() {
        return (categoria);
    }
    
    public int getMayores() {
        return (mayores);
    }
    
    public int getMenores() {
        return (menores);
    }
    
    public String getVehiculo() {
        return (vehiculo);
    }
}
