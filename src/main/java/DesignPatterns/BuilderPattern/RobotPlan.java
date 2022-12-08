package DesignPatterns.BuilderPattern;

public interface RobotPlan {

    public void setRobotHead(String Head);
    public void setRobotTorso(String Torso);
    public void setRobotArms(String Arms);
    public void setRobotLegs(String legs);
}
