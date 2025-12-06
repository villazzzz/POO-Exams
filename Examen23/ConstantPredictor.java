package Examen23;
public class ConstantPredictor implements lPredictor {
    private double ct;

    public ConstantPredictor() {
        this.ct=1;
    }
    public double predict(double[] entrada){
        return this.ct;
    }
}
