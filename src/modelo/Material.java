package modelo;

public class Material {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if(nome==null){
			return false;
		}
		this.nome = nome;
		return true;
	}

	public Integer getPrecoUnitario() {
		return precoUnitario;
	}

	public boolean setPrecoUnitario(Integer precoUnitario) {
		if(precoUnitario<=0 || precoUnitario == null){
			return false;
		}
		this.precoUnitario = precoUnitario;
		return true;
	}

	public String getDescricao() {
		return Descricao;
	}

	public boolean setDescricao(String descricao) {
		if(descricao == null){
			return false;
		}
		Descricao = descricao;
		return true;
	}

	private Integer precoUnitario;
	private String Descricao;
	
	Material(){
		
	}
}
