/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
