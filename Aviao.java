public class Aviao {
    String Empresa;    
    String CargaM;
    String Classe;
    int qntAssentos;

    public Aviao(String Empresa, String CargaM, String Classe, int qntAssentos){
        this.Empresa=Empresa;        
        this.CargaM=CargaM;        
        this.Classe=Classe;
        this.qntAssentos=qntAssentos;
    }public String getEmpresa(){
        return Empresa;
    }public void setEmpresa(String Empresa){
        this.Empresa=Empresa;
    }public String getCargaM(){
        return CargaM;
    }public void setCragaM(String CargaM){
        this.CargaM=CargaM;
    }public String getClasse(){
        return Classe;
    }public void setClasse(String Classe){
        this.Classe=Classe;
    }public int getQntAssentos(){
        return qntAssentos;
    }public void setQntAssentos(int qntAssentos){
        this.qntAssentos=qntAssentos;
    }
    public String decolar(){
        return "sair do chao e iniciar seu vôo.";
    }public void aterrizar(){
        System.out.println("Tem excelentes pilotos que conseguem realizar a aterrissagem com perfeição.");
    }
}
