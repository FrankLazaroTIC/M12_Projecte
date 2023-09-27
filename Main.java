import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Dispositius> lista = new ArrayList<>();
    
    String [] nombresD = {"rellotge","mòbil","iPhone","tablet","portatil"};
    
    static AltresDispositius rellotge = new AltresDispositius("Patek Philippe","1518",100,"rellotge",false,false," rellotge");
    
    static Smartphones mobil = new Smartphones("Sony","Xperia",300,"Android",false,false);
    
    static Smartphones iPhone = new Smartphones("iPhone","13",500,"IOS",true,true);
    
    static Tablet tablet = new Tablet("Xiaomi","TableMi",400,6);
    
    static AltresDispositius portatil = new AltresDispositius("Lenovo","ideapad3",800,"portatil",false,false,"portatil");


    public static void main(String[] args) {
        lista.add(rellotge);
        lista.add(mobil);
        lista.add(iPhone);
        lista.add(tablet);
        lista.add(portatil);
        System.out.println(lista);
    }
}
