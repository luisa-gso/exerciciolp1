public class Repositorio {
    private Funcionario[] BD;
    private int indice;

    public Repositorio() {
        indice = 0;
        BD = new Funcionario[8];
    }

    public void inserir(Funcionario F) {

        for (int i = 0; i < indice; i++) {
            if (BD[i].getCpf().equals(F.getCpf())) {
                System.out.println("ja cadastrado");
                return;
            }
            }
            if (indice < BD.length) {
                BD[indice] = F;
                indice++;
                System.out.println("Funcionário adicionado com sucesso.");
            } else {
                System.out.println("ja ta cheio");
            }
        }
        
 public void remover(Funcionario F){
    for (int i = 0; i < indice; i++) {
        if (BD[i].equals(F)) {
            BD [indice]= BD [indice-1];
            BD [indice - 1] = null;
            indice--;

        }
    }
 }

 public void bonificarALL(){
    for (int i = 0; i< indice; i++){
        BD[i].getBonificaçao();;
    }
}
public void imprimirALL(){
     for (int i = 0; i< indice; i++){
        BD[i].imprimir();
    }
}
}
