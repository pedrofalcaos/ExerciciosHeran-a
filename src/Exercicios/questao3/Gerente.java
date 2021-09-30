package Exercicios.questao3;

public class Gerente extends Empregado{

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente" +getNome()+
                " salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
