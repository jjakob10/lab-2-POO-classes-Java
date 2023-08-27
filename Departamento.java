import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Funcionario> getFuncionarios() {
        return new HashSet<Funcionario>(funcionarios);
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public int qtdFuncionarios() {
        return funcionarios.size();
    }

    public float mediaSalarial() {
        float salarios = 0;
        for (Funcionario f : funcionarios) {
            salarios += f.getSalario();
        }
        return salarios / funcionarios.size();
    }

}
