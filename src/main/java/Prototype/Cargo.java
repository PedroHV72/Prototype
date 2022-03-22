package Prototype;

public class Cargo implements Cloneable{
    private String funcao;
    private Float salario;

    public Cargo(String funcao, Float salario) {
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

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
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
