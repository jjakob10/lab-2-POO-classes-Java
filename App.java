public class App {
    public static void main(String[] args) {
        Empresa e = new Empresa("Empresa 1");

        Departamento v = new Departamento("Vendas");
        v.addFuncionario(new Funcionario("João", 30000));
        v.addFuncionario(new Funcionario("Pedro", 20000));

        Departamento r = new Departamento("RH");
        r.addFuncionario(new Funcionario("Camila", 20000));
        r.addFuncionario(new Funcionario("Joana", 15000));
        e.addDepartment(v);
        e.addDepartment(r);

        for (Departamento d : e.getDepartamentos()) {
            System.out.println(d.getNome() + " | Salario medio: " + d.mediaSalarial());
        }
        System.out.println("Salario medio na empresa: " + e.salarioMedio());

    }
}
