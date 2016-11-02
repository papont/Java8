package net.ant.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        //Обычный разработчик
        //Developer developer = new JavaDeveloper();
        //Senior разработчик
        //Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
