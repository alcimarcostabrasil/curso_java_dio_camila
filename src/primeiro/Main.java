package primeiro;

import java.util.Scanner;

import primeiro.models.Agenda;
import primeiro.models.Gato;
import primeiro.models.Livro;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("Marcos da silva", "82 09999-9999");
		Livro livro = new Livro("Curso de Java para programadores Python", "Alcimar Costa", 900);
		Gato gato = new Gato("Caldo de cana", 1);
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, resultado;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		resultado = a + b;
		System.out.println("O resultado da soma dos dois números é: " + resultado);
		
		System.out.println("Contato: " + agenda.getNome() + " - Telefone: " + agenda.getTelefone());
		System.out.println("Livro: " + livro.getTitulo() + " - Autor: " + livro.getAutor());
		System.out.println(gato);

	}

}
