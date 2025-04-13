//tem o método main

public class Empresa {
    public static void main(String[] args) {

        Funcionario func1 = new FuncionarioCLT("Ana", 3000.0, 500.0);

        Funcionario func2 = new FuncionarioPJ("Carlos", 4000.0, 10.0);

        System.out.println("-----Funcionário 1-----");
        func1.exibirDados();

        System.out.println("-----Funcionário 2-----");
        func2.exibirDados();
    }
}


