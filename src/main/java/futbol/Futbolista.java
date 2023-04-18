package futbol;

public abstract class Futbolista implements Comparable<Object>{

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre,int edad,String posicion){
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
        
    }

    public Futbolista(){

        this("Maradona",30,"delantero");
    }

    @Override
    public abstract int compareTo(Object o);

    public String getNombre(){

        return nombre;
    }
 
    public int getEdad() {
        return edad;
    }

    public String getPosicion(){

        return posicion;
    }

    public void setNombre(String n){
        nombre=n;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public boolean equals(Futbolista f){
        return posicion.equals(f.getPosicion());
    }

    public abstract boolean jugarConLasManos();

    @Override
    public String toString(){
        return "El futbolista " +nombre+ " tiene " +edad+ ", y juega de " + posicion;
    }
    
}
