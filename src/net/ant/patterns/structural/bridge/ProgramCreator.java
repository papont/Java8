package net.ant.patterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
//            new BankSystem(new JavaDeveloper()),
//            new StockExchange(new CppDeveloper())
              //можем поменять
              new BankSystem(new CppDeveloper()),
              new StockExchange(new JavaDeveloper())

        };

        for(Program program: programs){
            program.developProgram();
        }
    }
}
