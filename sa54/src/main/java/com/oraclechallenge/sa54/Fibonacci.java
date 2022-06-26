package com.oraclechallenge.sa54;

import java.util.List;

public class Fibonacci {
    
    private List<Long> fibonacci;
    private List<Long> sorted;
    
    
    public Fibonacci() {
    }
    
    public Fibonacci(List<Long> fibonacci, List<Long> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted
;
    }
    
    public List<Long> getFibonacci() {
        return fibonacci;
    }
    public List<Long> getSortedSequence() {
        return sorted
;
    }
    public void setFibonacci(List<Long> fibonacci) {
        this.fibonacci = fibonacci;
    }
    public void setSortedSequence(List<Long> sorted) {
        this.sorted = sorted
;
    }

    

}
