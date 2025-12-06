package Examen23;
public class TestLearner {
    public static void main(String[] args){
        double entrada[]={0.1,0.3,0.5,0.1};
        double weights[]={0.1,0.4,0.6,0.2};
        LinearPredictor linpredict = new LinearPredictor(weights);
        ConstantPredictor cpredict = new ConstantPredictor();
        LogisticPredictor logpredict = new LogisticPredictor(weights);

        System.out.println("Linear Predictor: "+linpredict.predict(entrada));
        System.out.println("Logistic Predictor: "+logpredict.predict(entrada));
        System.out.println("Constant Predictor: "+cpredict.predict(entrada));
    }

}
