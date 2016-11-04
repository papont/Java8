package net.ant.patterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("111111");
        ProgramLogger.getProgramLogger().addLogInfo("222222");
        ProgramLogger.getProgramLogger().addLogInfo("333333");
        ProgramLogger.getProgramLogger().addLogInfo("444444");
        ProgramLogger.getProgramLogger().addLogInfo("555555");
        ProgramLogger.getProgramLogger().showLogFile();

        System.out.println(ProgramLogger.getProgramLogger().toString());

    }
}
