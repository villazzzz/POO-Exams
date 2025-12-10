package Exam00;

public class TestSensors {
    public static void main(String [] args){
        TemperatureSensor ts = new TemperatureSensor("hola1023", 14.2);
        AveragingSensor as = new AveragingSensor("avsensor23");
        ts.updateLecture(1.2);
        System.out.println(ts.generateReport());
        as.updateLecture(1.0);
        as.updateLecture(3.0);
        as.updateLecture(2.0);
        System.out.println(as.generateReport());
        System.out.println(as.getValue());
    }
}
