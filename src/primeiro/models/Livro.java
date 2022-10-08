package primeiro.models;

import java.util.Objects;

public class Livro {
	
	private String titulo;
	private String autor;
	private Integer paginas;
	
	public Livro() {

	}

	public Livro(String titulo, String autor, Integer paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, paginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(paginas, other.paginas)
				&& Objects.equals(titulo, other.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
	
	
	

}
