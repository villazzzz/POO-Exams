package Exam00;
import java.util.*;

public class AveragingSensor implements Sensor{
    private String id;
    private List<Double> internLectures;

    public AveragingSensor(String id){
        this.id=id;
        this.internLectures = new ArrayList<>();
    }
    @Override
    public String getID(){
        return id;
    }
    @Override
    public double getValue(){
        double average=0.0;
        for(int i=0; i<this.internLectures.size(); i++){
            average+=this.internLectures.get(i)/this.internLectures.size();
        }
        return average;
    }
    @Override
    public void updateLecture(double newValue){
        this.internLectures.add(newValue);
    }
    public String generateReport(){
        double average=0.0;
        for(int i=0; i<this.internLectures.size(); i++){
            average+=this.internLectures.get(i)/this.internLectures.size();
        }
        int size=internLectures.size();
        String result="AveragingSensor[ID:<"+id+">, count=<"+size+">, average=<"+average+">]";
        return result;
    }
}
