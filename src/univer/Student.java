package univer;

public class Student {
    boolean present;
    double scoreAverage;
    String name;
    public Student(String name, double scoreAverage) {
        this.name = name;
        this.scoreAverage=scoreAverage;
        if ((int) Math.round((Math.random() * 6)) > 1)
            present = true;
        else present = false;
    }
    public boolean isPresent() {
        if (present == true) return true;
        else return false;
    }


    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

}

