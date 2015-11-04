public class Species {
  private int topFitness;
  private int staleness;
  private Genome[] genomes;
  private int avgFitness;
  
  public Species() {
	  topFitness = 0;
	  staleness = 0;
	  avgFitness = 0;
  }
}
