package net.starbasic.neurons;

import java.util.Arrays;

/**
 *
 * @author Серж
 */
public abstract class AbstractNeuron {
	private double weight[];
	private int size;
	public AbstractNeuron(int size){
    	this.size = size;
    	this.weight = new double[this.size];
    	for (int i = 0; i < this.size; i++) {
        	weight[i] = 1.0;
    	}
	}
    
	public AbstractNeuron(int size, double baseWeight){
    	this.size = size;
    	this.weight = new double[this.size];
    	for (int i = 0; i < this.size; i++) {
        	weight[i] = baseWeight;
    	}
	}
    
	public AbstractNeuron(double [] weight){
    	this.size = weight.length;
    	this.weight = Arrays.copyOf(weight, size);
	}
    
	public double getReaction(double [] input){
    	double sum = 0;
    	for (int i = 0; i < this.size; i++) {
        	sum+=input[i]*this.weight[i];    
    	}
    	return sum;
	}
    
	public abstract void weightUpdate(double [] input, double result);
}


