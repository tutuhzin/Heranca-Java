public class Tecnico extends Pessoa{
    private int Registro;

    public void praticar(){
        System.out.println("O técnico " + this.Nome + " está práticando... \nPrática concluída com Sucesso!");
    }

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int registro) {
        Registro = registro;
    }
}
