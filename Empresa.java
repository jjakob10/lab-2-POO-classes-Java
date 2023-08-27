import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // public void setDepartamentos(Set<Departamento> departamentos) {
    // this.departamentos = new HashSet<Departamento>(departamentos);
    // }

    public Set<Departamento> getDepartamentos() {
        return new HashSet<Departamento>(departamentos);
    }

    public void addDepartment(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void removeDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public boolean hasDepartment(Departamento departamento) {
        return departamentos.contains(departamento);
    }

    public float salarioMedio() {
        int qtdFuncionarios = 0;
        float salarios = 0;
        for (Departamento d : departamentos) {
            salarios += d.mediaSalarial() * d.qtdFuncionarios();
            qtdFuncionarios += d.qtdFuncionarios();
        }
        return salarios / qtdFuncionarios;
    }
}
