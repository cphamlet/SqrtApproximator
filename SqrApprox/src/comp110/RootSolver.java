package comp110;

public class RootSolver {
  public RootSolver(){
    
  }
  
  public static double solve(Approximator approximator, double radicand){
    double guess = 1.0;
    while(!approximator.goodEnough(guess, radicand)){
      guess = approximator.improve(guess, radicand);
    }
    return guess;
    
  }
  
}
