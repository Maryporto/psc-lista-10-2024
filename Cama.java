public class Cama {
    String material;
    String conforto;
    String qualidade;
    String espuma;

    public Cama(String material, String conforto, String qualidade, String espuma ){
        this.material=material;
        this.conforto=conforto;
        this.qualidade=qualidade;
        this.espuma=espuma;
    }public String getMaterial(){
        return material;
    }public void setMaterial(String material){
        this.material=material;
    }public String getConforto(){
        return conforto;
    }public void setConforto(String conforto){
        this.conforto,conforto;
    }public String getQualidade(){
        return qualidade;
    }public void setQualidade(int qualidade){
        this.qualidade=qualidade;
    }public String getEspuma(){
        return espuma;
    }public void setEspuma(String espuma){
        this.espuma=espuma;
    }
    public String dormir(){
        return "dormir confortavel";
    }public String acordar(){
        return "acordar descansado";
    }

    
}
