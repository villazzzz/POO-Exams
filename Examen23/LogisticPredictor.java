package Examen23;
import java.util.*;
public class LogisticPredictor implements lPredictor {
    private double[] w;

    public LogisticPredictor(double[] w){
        this.w=Arrays.copyOf(w, w.length);
    }
    @Override
    public double predict(double[] a){
        double result=0;
        double x=0;
        for(int i=0; i<a.length; i++){
            x+=a[i]*w[i];
        }
        result=1/(1+Math.exp(-x));
        return result;
    }
}
