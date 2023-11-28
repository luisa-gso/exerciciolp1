public class Gerente extends Funcionario {
    protected int CRM;

    public Gerente(int CRM, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.CRM = CRM;

    }

    public void getBonificaçao() {
        salario += salario * 9 / 100;

    }
    public void imprimir(){
      System.out.println("." + salario );  
    }

}
