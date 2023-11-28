public class Programador extends Funcionario {
    private String linguagem_prog;

    public Programador(String linguagem_prog, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.linguagem_prog = linguagem_prog;

    }
    
    public void getBonificaçao() {
      salario += salario * 15/100;   
    }
    
    public void imprimir() {
      System.out.println(nome); 
      System.out.println(salario );
    }
}
