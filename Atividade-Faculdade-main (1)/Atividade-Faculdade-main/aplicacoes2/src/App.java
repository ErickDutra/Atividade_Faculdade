public class App {
    public static void main(String[] args) throws Exception {
        
        ListaSequencial lista = new ListaSequencial();
        
        Aluno aluno = new Aluno(122, "jone");
        lista.inserirValor(aluno, 5);
        lista.mostra();
        
        System.out.println(lista.retornaValor(5));
    }
}
