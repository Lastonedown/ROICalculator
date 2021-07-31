import java.text.DecimalFormat;

public class Equipment {

    //instance variables
    private String name;
    private double cost;
    private double gain;
    public double ROI;

    //Equipment constructor
    public Equipment(String Name, double Cost, double Gain,double ROI) {
        this.name = Name;
        this.cost = Cost;
        this.gain = Gain;
        this.ROI = ROI;
    }

    public String getEquipName() {
        return name;
    }
    public void setEquipName(String EquipName) {
        this.name = EquipName;
    }
    public double getGain() {
        return gain;
    }
    public void setGain(double Gain) {
        this.gain = Gain;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double Cost) {
        this.cost = Cost;
    }
    public double getROI() {
        return ROI;
    }
    public void setROI(double ROI) {
        this.ROI = ROI;
    }

    DecimalFormat df = new DecimalFormat("#%");
    DecimalFormat df2 = new DecimalFormat("$#,###.00");
    public String toString(){
        return "Equipment Name: "+this.name+"\nGain: "+df2.format(this.gain)+"\nCost: "+df2.format(this.cost)+"\nROI: "+df.format(this.ROI)+"\n---------------------------------";
    }
}

