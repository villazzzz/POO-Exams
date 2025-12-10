package Exam00;

public interface Sensor {
    public String getID();
    public double getValue();
    public void updateLecture(double value);
    public String generateReport();
}
