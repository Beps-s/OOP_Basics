import java.util.ArrayList;

public class Menyy {
    private ArrayList<String> soogid;

    public Menyy() {
        this.soogid = new ArrayList<>();
    }

    public void lisaSook(String sook) {
        if (!soogid.contains(sook)) {
            soogid.add(sook);
        }
    }

    public void valjastaMenyy() {
        System.out.println("MENÜÜ");
        for (String sook : soogid) {
            System.out.println(sook);
        }
    }

    public void puhastaMenyy() {
        soogid.clear();
    }
}
