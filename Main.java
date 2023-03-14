public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Jose");
        v1.setIdade(25);
        v1.setSexo("M");

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.PagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();

        b1.setNome("Fabio");
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.PagarMensalidade();

        Professor p1 = new Professor();

        p1.setNome("Mario");
        p1.setIdade(35);
        p1.setSexo("M");
        p1.setSalario(100f);
        p1.setEspecialidade("Professor");
        System.out.println(p1.toString());
        p1.ReceberAumento(150.0f);

        Tecnico t1 = new Tecnico();

        t1.setNome("Gabriel");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.setRegistro(25485);
        t1.praticar();

    }
}