package Exam00;

public class TemperatureSensor implements Sensor {
    private String id;
    private double value;
    
    public TemperatureSensor(String id, double value){
        this.id=id;
        this.value=value;
    }
    @Override
    public String generateReport(){
        String result="TemperatureSensor[ID=<"+id+">, value=<"+value+">°C]";
        return result;
    }
    @Override
    public String getID(){
        return id;
    }
    @Override
    public double getValue(){
        return value;
    }
    @Override
    public void updateLecture(double newValue){
        this.value=newValue;
    }

}
