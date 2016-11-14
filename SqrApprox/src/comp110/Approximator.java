package comp110;

public interface Approximator {
  public boolean goodEnough(double guess, double radicand);
  public double improve(double guess, double randicand);
}
