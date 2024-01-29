public class PcOzellikleri{
    private String Isletim_Sistemi;
    public String Marka;
    private int ModelYili;

    public PcOzellikleri(String Isletim_Sistemi,String Marka, int ModelYili){
        this.Isletim_Sistemi=Isletim_Sistemi;
        this.Marka=Marka;
        this.ModelYili=ModelYili;
    }
    public void printSpe(){
        if(ModelYili<2020) System.out.println("Eski pc");
        else System.out.println("Yeni pc");
        System.out.println("Pc İsletim Sistemi: "+ Isletim_Sistemi + "\nPc Marka: " + Marka + "\nPc Modeli: " + ModelYili);
    }
    public int getModelYili(){
        return ModelYili;
    }
    public String getIsletim_Sistemi(){
        return Isletim_Sistemi;
    }
    public void setModelYili(int ModelYili){
        this.ModelYili = ModelYili;
    }
    public void setIsletim_Sistemi(String Isletim_Sistemi){
        this.Isletim_Sistemi = Isletim_Sistemi;
    }
}