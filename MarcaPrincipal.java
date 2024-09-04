package Enun;

public class MarcaPrincipal {

	public static void main(String[] args) {
		
		for(Marca marca : Marca.values()) {
			System.out.println("----------");
			System.out.println(marca);
		}

	}

}
