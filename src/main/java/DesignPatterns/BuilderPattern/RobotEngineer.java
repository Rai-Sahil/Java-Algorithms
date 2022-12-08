package DesignPatterns.BuilderPattern;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

    public static void main(String[] args){
        RobotBuilder robot = new OldRobotBuilder();

        RobotEngineer engineer = new RobotEngineer(robot);
        engineer.makeRobot();

        Robot firstRobot = engineer.getRobot();

        System.out.println("Robot was Build");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());
    }
}
