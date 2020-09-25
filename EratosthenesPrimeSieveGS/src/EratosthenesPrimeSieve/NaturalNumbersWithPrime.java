/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EratosthenesPrimeSieve;

import java.util.ArrayList;

/**
 *
 * @author 43676
 */
public class NaturalNumbersWithPrime {

    int obergrenze;
    
    public NaturalNumbersWithPrime(int pobergrenze) {
        obergrenze=pobergrenze;
    }
    
    public void numbersWithPrime()
    {
        ArrayList<Integer> evenNumbers=new ArrayList<Integer>();
        
        for (int i = 3; i <= obergrenze; i++) {
            if(i%2==0)
            {
                evenNumbers.add(i);
            }
        }
        
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.println(evenNumbers.get(i)+" summe: "+" = "+" + ");
        }
    }
    
}
