import java.util.ArrayList;

/**
 * @author Shamil Gradov
 */
public class Familie {
    private ArrayList<String> mitglieder = new ArrayList<String>();

    public Familie(String vater, String mutter) throws IllegalArgumentException{
        if(vater.trim().equals("")||mutter.trim().equals(""))
            throw new IllegalArgumentException("Name darf nicht leer sein");

        mitglieder.add(vater);
        mitglieder.add(mutter);
    }
    public void addKind(String kind)throws IllegalArgumentException{

        if (kind.trim().equals(""))
            throw new IllegalArgumentException("Name darf nicht leer sein");

        mitglieder.add(kind);
    }
    public enum Familienmitglied{
        VATER,MUTTER,KINDER
    }
    public String getMitglied(Familienmitglied person){
        if(person== Familienmitglied.VATER){
            return mitglieder.get(0);
        }
        if(person== Familienmitglied.MUTTER){
            return mitglieder.get(1);
        }
        if(person== Familienmitglied.KINDER){
            if(mitglieder.size()<3){
                return "";
            }
            ArrayList<String> kinder = new ArrayList<String>();
            for(int i=2;i<mitglieder.size();i++){
                kinder.add(mitglieder.get(i));
            }
            return String.join(", ",kinder);
        }
        return null;
    }
}