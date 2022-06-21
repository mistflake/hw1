package org.itmo.java.homework3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study ();
        study.setCourse("Изучение Java - это просто!». ");
        System.out.println(study.printCourse());

        Car car1 = new Car();
        Car car2 = new Car("Blue",20.0);
        car1.setName("first car");
        car2.setName("second car");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Building building1 = new Building();
        Building building2 = new Building();
        building1.setValues(2,1992,"90s one");
        building2.setValues(18,2030,"future one");
        System.out.println(building1.toString());
        System.out.println(building1.yearsSinceBuilt());
        System.out.println(building2.toString());
        System.out.println(building2.yearsSinceBuilt());

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(21,"alcohol-buying tree");
        Tree tree3 = new Tree(32,false,"too-much-alcohol tree");
    }
}
