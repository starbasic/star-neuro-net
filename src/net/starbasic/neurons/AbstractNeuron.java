package net.starbasic.neurons;

import java.util.Arrays;

/**
 *
 * @author Серж
 */
public abstract class AbstractNeuron {
	private double weight[];
	private int size;
        private AbstractNeuron input[];
	
        public AbstractNeuron(int size){
            this.size = size;
            this.weight = new double[this.size];
            input = new AbstractNeuron[this.size];
            for (int i = 0; i < this.size; i++) {
                    weight[i] = 1.0;
           }
	}
    
	public AbstractNeuron(int size, double baseWeight){
            this.size = size;
            this.weight = new double[this.size];
            input = new AbstractNeuron[this.size];
            for (int i = 0; i < this.size; i++) {
                    weight[i] = baseWeight;
            }
	}
    
	public AbstractNeuron(double [] weight){
            this.size = weight.length;
            this.weight = Arrays.copyOf(weight, size);
             input = new AbstractNeuron[this.size];
	}
    
	public double getReaction(){
    	double sum = 0;
    	for (int i = 0; i < this.size; i++) {
        	sum+=input[i].getReaction()*this.weight[i];    
            }
            return sum;
	}
    
        public void setReletion(int i, AbstractNeuron inputNeuro){
            input[i] = inputNeuro;
        }
	public abstract void weightUpdate(double result);
}


