package comp110;

public class main {
  public static void main(String[] args){
    
    SqrtApproximator n = new SqrtApproximator(); 
   
    double guess = 1;
    
    guess = n.improve(guess, 49);
    guess = n.improve(guess, 49);
    guess = n.improve(guess, 49);
    guess = n.improve(guess, 49);
    guess = n.improve(guess, 49);
    System.out.println(n.improve(guess, 49));
    
  }
}
