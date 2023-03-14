public abstract class Pessoa {
    protected String Nome;
    protected int Idade;
    protected String sexo;

    public void fazerAniversario() {
        this.Idade++;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
