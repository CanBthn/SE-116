public class Pc {
    public static void main(String[] args){
        //Obje oluştururken Class_Adı rastgele = new Class_Adı();
        /* Constructer kullanmadan yapıyorsak
        PcOzellikleri ozellik = new PcOzellikleri();
        //Eğer public olursa direkt ozellik.marka diyerek değer atayabiliriz
        ozellik.Marka = "Msı";
        System.out.println(ozellik.Marka);
        //Private ise böyle olmalı set ve get kullanmalıyız
        ozellik.setIsletim_Sistemi("Windows");
        System.out.println(ozellik.getIsletim_Sistemi());
        */
        //Eğer constructer ile yapıyorsak
        PcOzellikleri ozellik = new PcOzellikleri("Windows", "Msı", 2023);
        ozellik.printSpe();
    }
}