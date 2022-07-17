import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXP());

        Dev devDeborah = new Dev();
        devDeborah.setNome("Deborah");
        devDeborah.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devDeborah.getConteudosInscritos());
        devDeborah.progredir();
        System.out.println("Conteúdos Inscritos " + devDeborah.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devDeborah.getConteudosConcluidos());
        System.out.println("XP: " + devDeborah.calcularXP());
    }
}
