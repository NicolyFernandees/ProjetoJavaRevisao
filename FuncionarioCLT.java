//herança
public class FuncionarioCLT extends Funcionario{
    private double beneficio;

    public FuncionarioCLT(String nome, double salario, double beneficio) {
        super(nome, salario);
        this.beneficio = beneficio;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Benefício do funcionario(a): " + beneficio);
    }
}
