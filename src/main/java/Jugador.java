public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre,int edad,String posicion,short g,byte d){
        super(nombre,edad,posicion);
        golesMarcados=g;
        dorsal=d;
    }

    public Jugador(){
        golesMarcados=289;
        dorsal=7;

    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Futbolista f) {
        return Math.abs(getEdad()-f.getEdad());
    }

    @Override
    public String toString(){
        return "El futbolista" +getNombre()+ "tiene" +getEdad()+ ",y juega de" + getPosicion()+" con el dorsal "+dorsal+". Ha marcado "
        +golesMarcados;
    }
}
