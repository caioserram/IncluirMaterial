package modelo;

public class Gerente {

	public static void insereMaterial(String pacote) {
		
		String[] pack = pacote.split(",");
		Material material = new Material();
		material.setNome(pack[0]);
		material.setPrecoUnitario(Integer.parseInt(pack[1]));
		material.setDescricao(pack[2]);
	}
	
}
