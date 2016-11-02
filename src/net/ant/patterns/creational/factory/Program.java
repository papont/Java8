package net.ant.patterns.creational.factory;


public class Program {
    public static void main(String[] args) {
    //        Developer developer = new JavaDeveloper();
    //        developer.writeCode();

//        DeveloperFactory factory = new JavaDeveloperFactory();
//        DeveloperFactory factory = new CppDeveloperFactory();
        DeveloperFactory factory = createDeveloperBySpecialty("java");

        Developer developer = factory.createDeveloper();

        developer.writeCode();
    }


    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }

    }

}
