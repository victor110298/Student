package univer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends Group {
    public Menu() {
        mainMenu();
        selectMenu();
        chooseGroup();
        rollCall();
        chooseLeader();
        exit();

    }

    public void mainMenu() {
        System.out.println("Вітаю вас! Виберіть будь ласка опцію програми");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1 :   Вибрати університет");
        System.out.println("2 :   Показати групи");
        System.out.println("3 :   Зробити перекличку");
        System.out.println("4 :   Вибрати старосту групи");
        System.out.println("5 :   Вийти з програми");
        System.out.println("-------------------------------------------------------------");
    }

    public void selectMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть університет");
        String univercity = sc.next();
        try {
            Univercity univercity1 = Univercity.valueOf(univercity);
            switch (univercity1) {
                case KPI: {
                    System.out.println("Вас вітає Київський політехнічний університет!");
                }
                break;
                case LNU: {
                    System.out.println("Вас вітає Львівський національний університет");
                }
                break;
                case UKU: {
                    System.out.println("Вас вітає Український католицький університет");
                }
                break;
                case KNAU: {
                    System.out.println("Вас вітає Київський національний авіаційний університет");
                }
                break;
                case NULP: {
                    System.out.println("Вас вітає Національний  університет Львівська політехніка ");

                }
                break;

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Даного університету неіснує, повторіть спробу");
            System.out.println("-------------------------------------------------------------");

            selectMenu();
        }
    }

    public void chooseGroup() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Виберіть групу:");
        Scanner sc = new Scanner(System.in);
        String group = sc.next();
        try {
            Groups groups = Groups.valueOf(group);

            switch (groups) {
                case Law: {
                    System.out.println("Ви вибрали групу права");
                    Profesor pr1 = new Profesor("Петро Степанович", 56);
                    System.out.println(pr1.toString());

                }
                break;
                case Math: {
                    System.out.println("Ви вибрали групу математики");
                    Profesor pr2 = new Profesor("Василь Миколайович", 45);
                    System.out.println(pr2.toString());

                }
                break;
                case Biology: {
                    System.out.println("Ви вибрали групу біології");
                    Profesor pr3 = new Profesor("Зеновій Євгенович", 63);
                    System.out.println(pr3.toString());
                }
                break;
                case History: {
                    System.out.println("Ви вибрали групу історії");
                    Profesor pr4 = new Profesor("Аркадій Вікторович", 35);
                    System.out.println(pr4.toString());
                }
                break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Даної групи не існує, повторіть спробу");
            System.out.println("-------------------------------------------------------------");
            chooseGroup();
        }
    }

    public void rollCall() {
        Group group=new Group();
        Student student;
        List<Student> present = new ArrayList<Student>();
        List<Student> absent = new ArrayList<Student>();
        for (int i = 0; i <group.students.size() ; i++) {
            student = group.getStudent(i);
            if (student.isPresent())
                present.add(student);
            else absent.add(student);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Присутні студенти:");

        for (int i = 0; i < present.size(); i++) {
            student = present.get(i);
            System.out.println("Student " + student.getName() + " is Present");
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Відсутні студенти:");
        for (int i = 0; i < absent.size(); i++) {
            student = absent.get(i);
            System.out.println("Student " + student.getName() + " is Absent");
        }
    }
    int k=0,l=0;

    public void chooseLeader() {
        Student student;
        int a=0;
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            student = getScore(i);
            if (student.scoreAverage >10.0) {
                a++;
                if (a<=2)
                    System.out.println("Кандидат №"+a+" "+student.name);}
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Ім'я виборця: " + getNam(i));
            Scanner sc = new Scanner(System.in);
            System.out.println("Якщо бажаєте проголосувати за кандидата №1 натисність 1, кандидата №2 натисніть 2");
            int j=sc.nextInt();
            switch (j) {
                case 1: {
                    ++k;

                }
                break;
                case 2: {
                    ++l;

                }
                break;
                default:{
                    System.out.println("Такого номера не існує повторіть спробу");
                    sc.nextInt();
                }
            }

        }
        System.out.println("Кандидат №1 набрав "+k+" голоси"+"Кандидат №2 набрав "+l+" голосів");
        if (k>l) {
            System.out.println("Переміг кандидат №1");}

         else if(k==l){
                System.out.println("Нічия, переможця не виявлено");
            }
        else System.out.println("Переміг кандидат №2");
    }

    public static void exit(){
        System.out.println("Вийти з програми");
    }
}

