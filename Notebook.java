public class Notebook {
    String marca;
    String configuracao;
    String tela;
    String performance;

    public Notebook (String marca, String configuracao, String tela, String performance){
        this.marca=marca;
        this.configuracao=configuracao;
        this.tela=tela;
        this.performance=performance;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getConfiguracao(){
        return configuracao;
    }public void setConfiguracao(String configuracao){
        this.configuracao=configuracao;
    }public String getTela(){
        return tela;
    }public void setTela(String tela){
        this.tela=tela;
    }public String getPerformance(){
        return performance;
    }public void setPerformance(String performance){
        this.performance=performance;
    }
    public String estudar(){
        return "estudar para melhor o conhecimento";
    }public String trabalhar(){
        return "trabalhar para ganhar money";
    }

    
}
