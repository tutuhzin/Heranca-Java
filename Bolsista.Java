public class Bolsista extends Aluno{
    private int Bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando Bolsa" + this.Nome);
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.Nome + " é bolsista!");
    }

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float bolsa) {
        this.Bolsa = Bolsa;
    }
}

