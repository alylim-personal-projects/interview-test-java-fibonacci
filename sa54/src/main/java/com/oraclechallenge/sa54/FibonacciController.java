package com.oraclechallenge.sa54;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    
    //handle query parameters
    //http://localhost:8080/fibonacci?elements=10
    @GetMapping("/fibonacci")
    public Fibonacci fibonacciQueryParam(@RequestParam("elements") Integer elements){
        
        List<Long> sequence = Stream
        .iterate(new Long[] { 0L , 1L }, f -> new Long[]{ f[1], f[0] + f[1] })
        .limit(elements)
        .map(n -> n[0])
        .collect(Collectors.toList());
        
        //Concat
        List<Long> sorted = Stream.concat(
            //stream to get even numbers reversed
            sequence.stream()
            .filter(x -> x % 2 == 0)
            .sorted(Comparator.reverseOrder()),
            //stream to get odd numbers reversed
            sequence.stream()
            .filter(x -> x % 2 != 0)
            .sorted(Comparator.reverseOrder()))
            .collect(Collectors.toList());
        
        
        return new Fibonacci(sequence, sorted);
    }

}
