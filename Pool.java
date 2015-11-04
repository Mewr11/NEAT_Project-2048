public class Pool {
  private Species[] species;
  private int generation;
  private int innovation;
  //may be deprecated at some point
  private int currentSpecies;
  private int currentGenome;
  private int currentFrame;
 
  private int maxFitness;
  
  public Pool() {
	  generation = 0;
	  innovation = 0;
	  currentSpecies = 1;
	  currentGenome = 1;
	  currentFrame = 0;
	  maxFitness = 0;
  }
  
  public int newInnovation() {
	  innovation ++;
	  return innovation;
  }
}
