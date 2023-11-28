public class Departamentos extends Gerente {
    private int qtd_departamentos;
    

    public Departamentos(int qtd_departamentos,int CRM, String nome, String cpf, double salario){
        super(CRM, nome, cpf, salario);
        this.qtd_departamentos = qtd_departamentos;
    }
    public void getBonificaçao(){
        salario += salario* 11/100;
    }
    public void imprimir(){
        System.out.println(nome);
        System.out.println(salario);
    }
}
