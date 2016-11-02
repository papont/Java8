package net.ant.patterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }

    private String sendWeekReport() {
        return " Send week report.";
    }
}
