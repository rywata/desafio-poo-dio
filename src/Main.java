import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao: Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao("Descricao: Curso Java 2");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao: Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTenshi = new Dev();
        devTenshi.setNome("Tenshi");
        devTenshi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Tenshi: " + devTenshi.getConteudosInscritos());
        devTenshi.progredir();
        devTenshi.progredir();
        devTenshi.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Tenshi: " + devTenshi.getConteudosInscritos());
        System.out.println("Conteudos concluidos Tenshi: " + devTenshi.getConteudosConcluidos());
        System.out.println("XP: " + devTenshi.calcularTotalXp());

        System.out.println("--------");

        Dev devAiko = new Dev();
        devAiko.setNome("Aiko");
        devAiko.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Aiko: " + devTenshi.getConteudosInscritos());
        devAiko.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Aiko: " + devTenshi.getConteudosInscritos());
        System.out.println("Conteudos concluidos Aiko: " + devAiko.getConteudosConcluidos());
        System.out.println("XP: " + devAiko.calcularTotalXp());


    }
}