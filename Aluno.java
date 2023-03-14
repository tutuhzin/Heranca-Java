public class Aluno extends Pessoa {
    private int Matricula;
    private String Curso;

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.Nome);

    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }
}
