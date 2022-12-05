public class ListaSequencial{
   private Aluno[] vetor = new Aluno[10];
   private int totalElementos = 10;
 
 
//    public void inserirValor(Aluno matricula, Aluno nome, int posicao){
//          for(int i = 0; i < tamanho();i++){
//             if(posicao == i){
//                 vetor[i] = matricula;
//                 vetor[i + 1] = nome;
//             }
//          }
//    }
   
   public void inserirValor(Aluno aluno, int posicao){
        if(posicao < tamanho()){
        vetor[posicao] = aluno;
        }
    }
   
   
   public void adiciona(Aluno valor){
            garanteEspaço();
            vetor[totalElementos] = valor;
            totalElementos++;
    }

    public void garanteEspaço() {
        if(totalElementos == vetor.length){
            Aluno[] novoVetor = new Aluno[vetor.length * 2];
            for(int i = 0; i < vetor.length; i++){
                novoVetor[i] = vetor[i];

            }
            vetor = novoVetor;
        }
    }
    public int tamanho(){
        return totalElementos;
    }
    public Aluno retornaValor(int posicao){
        if(posicao < tamanho()){
            return vetor[posicao];
        }else{
            System.out.println("Posição maior que o tamanho do vetor");
            return null;
        }
    }
    public boolean contem(Aluno aluno){
        for(int i = 0; i < tamanho(); i++){
            if(aluno.equals(vetor[i])){
                return true;
            }
        }
        return false;
    }
    public void remove(int posicao){
        for(int i = 0; i < tamanho(); i++){
            vetor[i] = vetor[i + 1];
        }
        totalElementos--;
    }
    public Aluno buscarPorNome(String nome){
        for(int i = 0;i < tamanho();i++){
            if(nome.equals(vetor[i].getNome())){
                return vetor[i];
            }
        }
        return null;
    }
    public void mostra(){
        for(int i = 0;i < tamanho(); i++){
            System.out.println(vetor[i]+" , ");
        }
        System.out.println();
    }




    //public void inserirValor(String nome, int posicao) {
        
    
    
}