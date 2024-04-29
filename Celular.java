public class Celular {
    public String marca;
    public String qualidade;
    public String cor;
    public int memoria;

    public Celular(String marca, String qualidade,String cor,int memoria){
        this.marca=marca;
        this.qualidade=qualidade;
        this.cor=cor;
        this.memoria=memoria;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getMaterial(){
        return material;
    }public void setQualidade(String qualidade){
        this.qualidade=qualidade;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public int getPeso(){
        return peso;
    }public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    public String ligar(){
        return "ligar";
    }
    public String mensagem(){
        return "mensagem";
    }
    
}
