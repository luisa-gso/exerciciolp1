public class Projetos extends Gerente{
    private int qtd_projetos;



    public Projetos (int qtd_projetos, int CRM, String nome, String cpf, double salario){
        super(CRM, nome, cpf, salario);
        this.qtd_projetos = qtd_projetos;
    }


    public void getBonificaçao() {
        salario +=salario * 10/100;
    }
    public void imprimir (){
        System.out.println(nome);
        System.out.println(salario);
    }
}
