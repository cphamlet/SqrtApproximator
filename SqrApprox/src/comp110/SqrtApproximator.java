package comp110;
import java.util.*;
public class SqrtApproximator implements Approximator{
  public SqrtApproximator(){
    
  }
  
  public boolean goodEnough(double guess, double radicand){
    return (Math.abs(guess*guess - radicand)) < 0.001;
  }

  public double improve(double guess, double radicand) {
    return (guess+ (radicand /guess))/2.0;

  }
   
   
}
