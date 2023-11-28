public class App {
    public static void main(String[] args) throws Exception {
        Gerente g1 = new Gerente(145, "joao", "15047-5", 2000.0);
        Programador p1 = new Programador("java", "maria", "65897-2", 5500.0);
        Projetos gp = new Projetos(15762, 25, "Paulo", "459875-1", 3300.0);
        Departamentos dp = new Departamentos(43218, 5, "tiago", "49875267-4", 4500.0);
        Departamentos dp1 = new Departamentos(43218, 5, "tiago", "49875267-4", 4500.0);

        Repositorio BD = new Repositorio();

        BD.inserir(dp);
        dp.getBonificaçao();
        dp.imprimir();
         BD.inserir(dp1);

      
        
    }

}
