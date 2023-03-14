public class Professor extends Pessoa {
    private String Especialidade;
    private float Salario;

    public void ReceberAumento(float aumentoPorcentual) {
        this.setSalario(this.getSalario() + (aumentoPorcentual / 100) * this.getSalario());
        System.out.println("Seu salário atual é: " + aumentoPorcentual + " com o aumento porcentual");
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String professor) {
        Especialidade = Especialidade;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = Salario;
    }

}
