package primeiro;

import primeiro.models.Agenda;
import primeiro.models.Gato;
import primeiro.models.Livro;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("Marcos da silva", "82 09999-9999");
		Livro livro = new Livro("Curso de Java para programadores Python", "Alcimar Costa", 900);
		Gato gato = new Gato("Caldo de cana", 1);
		
		System.out.println("Contato: " + agenda.getNome() + " - Telefone: " + agenda.getTelefone());
		System.out.println("Livro: " + livro.getTitulo() + " - Autor: " + livro.getAutor());
		System.out.println(gato);

	}

}
