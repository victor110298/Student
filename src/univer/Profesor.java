package univer;

public class Profesor {String name;
    int age;
    public Profesor(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Ім'я професора: "+this.name+";"+" Вік викладача: "+this.age+" років;";
    }

}
