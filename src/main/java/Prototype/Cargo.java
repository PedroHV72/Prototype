package Prototype;

public class Cargo implements Cloneable{
    private String funcao;
    private int salario;

    public Cargo(String funcao, int salario) {
        super();
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "funcao='" + funcao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
