package futbol;
public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre,int edad,short g,byte d){
        super(nombre,edad,"Portero");
        golesRecibidos=g;
        dorsal=d;
    }
    public short getGolesRecibidos(){

        return golesRecibidos;
    }

    @Override
    public int compareTo(Object f) {
        return Math.abs(golesRecibidos-((Portero)f).getGolesRecibidos());
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString(){
        return "El futbolista " +getNombre()+ " tiene " +getEdad()+ ", y juega de " + getPosicion()+" con el dorsal "+dorsal+". Le han marcado "
        +golesRecibidos;
    }



    
}
