package net.starbasic.neurons;

/**
 *
 * @author Серж
 */
public class Receptor extends AbstractNeuron {
    private double signal;
    public Receptor(double signal) {
        super(1);
        this.signal = signal; 
    }

    @Override
    public double getReaction(){
        return signal;
    }
    @Override
    public void weightUpdate(double result) {
        //
    }
    
}
