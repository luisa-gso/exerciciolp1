public abstract class Funcionario {
protected String nome;
protected String cpf;
protected double salario;


public Funcionario(String nome, String cpf , double salario){
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
}


public String getCpf() {
    return cpf;
}

public abstract void getBonificaçao();

public abstract void imprimir();

}