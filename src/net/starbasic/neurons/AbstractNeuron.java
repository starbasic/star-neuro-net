package net.starbasic.neurons;

import java.util.Arrays;

/**
 *
 * @author Серж
 */
public abstract class AbstractNeuron {
	protected double weight[];
	protected int size;
        protected AbstractNeuron input[];
	
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
    
        public void setRelation(int i, AbstractNeuron inputNeuron){
            input[i] = inputNeuron;
        }
	public abstract void weightUpdate(double result);
}


