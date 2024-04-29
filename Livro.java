public class Livro {
    String Editora;
    String Autor;
    int qntPagina;
    String GeneroLiterario;

    public Livro(String editora, String autor, int qntPagina, String GeneroLiterario){
        this.editora=editora;
        this.autor=autor;
        this.qntPagina=qntPagina;
        this.generoLiterario=generoLiterario;
    }public String getEditora(){
        return editora;
    }public void setEditora(String editora){
        this.editora=editora;
    }public String getAutor(){
        return autor;
    }public void setAutor(String autor ){
        this.autor=autor;
    }public int getQntPagina(){
        return qntPagina;
    }public void setQntPagina(int qntPagina){
        this.qntPagina=qntPagina;
    }public String getGeneroLiterario(){
        return generoLiterario;
    }public void setGeneroLiterario(String generoLiterario){
        this.generoLiterario=generoLiterario;
    }
    public String ler(){
        return "entreterimento";
    }public String estudar(){
        return "aprender";
    }

    
}
