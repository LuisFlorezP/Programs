
package Plan;

public class cliente {   
    private String nombre;
    private String doc;
    private int edad;
    private char categoria;
    private int mayores;
    private int menores;
    private String vehiculo;
    
    public cliente() {}
    
    public cliente(String nombre, String doc, int edad, char categoria, int mayores, int menores, String vehiculo) {
        this.nombre = nombre;
        this.doc = doc;
        this.edad = edad;
        this.categoria = categoria;
        this.mayores = mayores;
        this.menores = menores;
        this.vehiculo = vehiculo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return (nombre);
    }
    
    public void setDoc(String doc) {
        this.doc = doc;
    }
    
    public String getDoc() {
        return (doc);
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return (edad);
    }
    
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public char getCategoria() {
        return (categoria);
    }
    
    public void setMayores(int mayores) {
        this.mayores = mayores;
    }
    
    public int getMayores() {
        return (mayores);
    }
    
    public void setMenores(int menores) {
        this.menores = menores;
    }
    
    public int getMenores() {
        return (menores);
    }
    
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String getVehiculo() {
        return (vehiculo);
    }
}
