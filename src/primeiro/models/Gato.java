package primeiro.models;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private Integer idade;
	
	public Gato() {

	}
	
	public Gato(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
