package ejemplosSingleton;

public class Programa {

	public static void main(String[] args) {
//		Director dire4=Director.getInstance();
//		Director dire=Director.getInstance("Joaquin");
		Director dire2=Director.getInstance("Manolo");
		Director dire3=Director.getInstance();
//		System.out.println(dire);
		System.out.println(dire2);
		System.out.println(dire3);
//		System.out.println(dire4);
//		Director dire3= new Director("Pedro");
//		System.out.println(dire2.equals(dire));
	}

}
