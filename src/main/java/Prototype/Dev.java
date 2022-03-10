package Prototype;

public class Dev implements Cloneable{
    private String nome;
    private String sobrenome;
    private int idade;
    private String email;
    private Cargo cargo;

    public Dev(String nome, String sobrenome, int idade, String email, Cargo cargo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public Dev clone() throws CloneNotSupportedException {
        Dev devClone = (Dev) super.clone();
        devClone.cargo = (Cargo) devClone.cargo.clone();
        return devClone;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
