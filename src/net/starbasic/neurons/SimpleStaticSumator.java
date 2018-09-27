package net.starbasic.neurons;

/**
 *
 * @author Серж
 */
public class SimpleStaticSumator extends AbstractNeuron {
    public SimpleStaticSumator(double weight[], AbstractNeuron input[]) {
        super(weight);
        this.input = input; 
    }

    @Override
    public void weightUpdate(double result) {
        //
    }
    
}
