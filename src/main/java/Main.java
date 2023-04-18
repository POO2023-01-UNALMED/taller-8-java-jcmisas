import futbol.*;

public class Main {
    public static void main(String[] args) {
        // Futbolista f = new Futbolista("Alejo", 20, "Delantero") {
			
		// 	@Override
		// 	public int compareTo(Object o) {
		// 		// TODO Auto-generated method stub
		// 		return 0;
		// 	}
			
		// 	@Override
		// 	public boolean jugarConLasManos() {
		// 		// TODO Auto-generated method stub
		// 		return false;
		// 	}
		// };

        // System.out.println(f.getEdad()==20);
        // System.out.println(f.getNombre().equals("Alejo"));
        // System.out.println(f.getPosicion().equals("Delantero"));

        // Futbolista f = new Futbolista() {
			
		// 	@Override
		// 	public int compareTo(Object o) {
		// 		// TODO Auto-generated method stub
		// 		return 0;
		// 	}
			
		// 	@Override
		// 	public boolean jugarConLasManos() {
		// 		// TODO Auto-generated method stub
		// 		return false;
		// 	}
		// };

        // System.out.println(f.getEdad()==30);
        // System.out.println(f.getNombre().equals("Maradona"));
        // System.out.println(f.getPosicion().equals("delantero"));

        // Futbolista f = new Futbolista() {
			
		// 	@Override
		// 	public int compareTo(Object o) {
		// 		// TODO Auto-generated method stub
		// 		return 0;
		// 	}
			
		// 	@Override
		// 	public boolean jugarConLasManos() {
		// 		// TODO Auto-generated method stub
		// 		return false;
		// 	}
		// };

        // String  comp = "El futbolista Maradona tiene 30, y juega de delantero";

        // System.out.println(f.toString());
        // System.out.println(f.toString().equals(comp));

        Futbolista f2 = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		Futbolista f1 = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Futbolista f3 = f1;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(!f1.equals(f2));
        System.out.println(f1.equals(f3));


		// Jugador f = new Jugador();
		// String  comp = "El futbolista Maradona tiene 30, y juega de delantero con el dorsal 7. Ha marcado 289";

		// System.out.println(f.toString().equals(comp));
		// System.out.println(f.toString());

		// Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		// String  comp = "El futbolista Santiago tiene 23, y juega de Portero con el dorsal 8. Le han marcado 6";

		// System.out.println(f.toString().equals(comp));
		// System.out.println(f.toString());

    }
}
