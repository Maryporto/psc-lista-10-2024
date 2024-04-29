public class Panela {
    public String material;
    public double altura;
    public double largura;
    public String cabo;

    public Porta(String material, double altura, double largura, String cabo){
        this.material=material;
        this.altura=altura;
        this.largura=largura;
        this.cabo=cabo;

    }public String getMaterial(){
        return material;
    }public void setMaterial(String material){
        this.material=material;
    }public double getAltura(){
        return altura;
    }public void setAltura(double altura){
        this.altura=altura;
    }public double getLargura(){
        return largura;
    }public void setLargura(double largura){
        this.largura=largura;
    }public String getCabo(){
        return cabo;
    }public void setCabo(String cabo){
        this.cabo=cabo;
    }

    public String cozinhar(){
        return "cozinhar comida.";
    
    
}
