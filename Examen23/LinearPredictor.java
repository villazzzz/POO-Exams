package Examen23;
import java.util.*;
public class LinearPredictor implements lPredictor {
    private double[] weights;

    public LinearPredictor(double[] weights){
        this.weights=Arrays.copyOf(weights, weights.length);
    }
    @Override
    public double predict(double[] a){
        double result=0;
        for(int i=0; i<a.length; i++){
            result+=a[i]*weights[i];
        }
        return result;
    }
}
