import java.util.Comparator;

public class ROICalc implements Comparator<Equipment> {
    public ROICalc() {
    }

    public int compare(Equipment e1, Equipment e2) {
        return e1.getROI() < e2.getROI() ? 1 : -1;
    }
}
