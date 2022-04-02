import java.io.Serializable;
import java.util.Comparator;

public class Airports implements Serializable {
    private int name0;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private double name6;

    private double name7;

    private double name8;

    private double name9;

    private String name10;

    private String name11;

    private String name12;

    public Airports(String[] name) {
        this.name0 = Integer.parseInt(name[0]);
        this.name1 = name[1];
        this.name2 = name[2];
        this.name3 = name[3];
        this.name4 = name[4];
        this.name5 = name[5];
        this.name6 = Double.parseDouble(name[6]);
        this.name7 = Double.parseDouble(name[7]);
        this.name8 = Double.parseDouble(name[8]);

        try {
        this.name9 = Double.parseDouble(name[9]);
        } catch (NumberFormatException e) {
            this.name9 = 0;
        }

        this.name10 = name[10];
        this.name11 = name[11];
        this.name12 = name[12];
    }

    public int getName0() {
        return name0;
    }

    public void setName0(int name0) {
        this.name0 = name0;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public double getName6() {
        return name6;
    }

    public void setName6(double name6) {
        this.name6 = name6;
    }

    public double getName7() {
        return name7;
    }

    public void setName7(double name7) {
        this.name7 = name7;
    }

    public double getName8() {
        return name8;
    }

    public void setName8(double name8) {
        this.name8 = name8;
    }

    public double getName9() {
        return name9;
    }

    public void setName9(double name9) {
        this.name9 = name9;
    }

    public String getName10() {
        return name10;
    }

    public void setName10(String name10) {
        this.name10 = name10;
    }

    public String getName11() {
        return name11;
    }

    public void setName11(String name11) {
        this.name11 = name11;
    }

    public String getName12() {
        return name12;
    }

    public void setName12(String name12) {
        this.name12 = name12;
    }

    @Override
    public String toString() {

        var builder = new StringBuilder();
        builder.append("["+name0+"] ").append("["+name1+"] ").append("["+name2+"] ").append("["+name3+"] ").append("["+name4+"] ").
                append("["+name5+"] ").append("["+name6+"] ").append("["+name7+"] ").append("["+name8+"] ").append("["+name9+"] ").
                append("["+name10+"] ").append("["+name11+"] ").append("["+name12+"] ");

        return builder.toString();
    }

}
