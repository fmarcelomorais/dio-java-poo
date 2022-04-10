package exerciocioDio.bootcamp;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso de java");
		curso1.setCargaHoraria(2);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Descrição curso de javascript");
		curso2.setCargaHoraria(3);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Curso de POO");
		curso3.setDescricao("Descricao do curso de POO");
		curso3.setCargaHoraria(5);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de java");
		mentoria1.setDescricao("Descrição da mentoria de java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescricao("Descricao do bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMarcelo = new Dev();
		devMarcelo.setNome("Marcelo");
		
		devMarcelo.inscreverBootcamp(bootcamp);
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		
		devMaria.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos "+ devMarcelo.getNome() +" "+ devMarcelo.getConteudosInscritos());
		System.out.println("Conteudos Inscritos "+ devMaria.getNome() +" "+ devMaria.getConteudosInscritos());
		devMarcelo.progredir();
		System.out.println("Conteudos Concluidos "+ devMarcelo.getNome() +" "+ devMarcelo.getConteudosConcluidos());
		devMaria.progredir();
		System.out.println("Conteudos Concluidos "+ devMaria.getNome() +" "+ devMaria.getConteudosConcluidos());
		
		
		
		
	}
}
