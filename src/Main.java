import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda Java do zero");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Aprenda JavaScript do zero");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Aprenda Java do zero");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGusta = new Dev();
        devGusta.setName("Gustavo");
        devGusta.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos em que " + devGusta.getName() + " está inscrito: " + devGusta.getConteudosInscritos());
        devGusta.progredir();
        devGusta.progredir();
        System.out.println("===========================");
        System.out.println("Conteúdos em que " + devGusta.getName() + " está inscrito: " + devGusta.getConteudosInscritos());
        System.out.println("===========================");
        System.out.println("Conteúdos que " + devGusta.getName() + " concluiu: " + devGusta.getConteudosConcluidos());
        System.out.println("XP: " + devGusta.calcularTotalXp());

        System.out.println("===========================");
        System.out.println("===========================");

        Dev devMaria = new Dev();
        devMaria.setName("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos em que " + devMaria.getName() + " está inscrita: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("===========================");
        System.out.println("Conteúdos em que " + devMaria.getName() + " está inscrita: " + devMaria.getConteudosInscritos());
        System.out.println("===========================");
        System.out.println("Conteúdos que " + devMaria.getName() + " concluiu: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
