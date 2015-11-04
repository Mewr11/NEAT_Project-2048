import java.util.HashMap

public class Genome {
  private Gene[] genes;
  private int fitness;
  private int adjustedFitness;
  private Object network;//Original Lua code not well documented
  private int maxNueron;
  private int globalRank;
  private HashMap<String, Double> mutationRates;
  
  public Genome() {
	  fitness = 0;
	  adjustedFitness = 0;
	  maxNueron = 0;
	  globalRank = 0;
	  mutationRates = new HashMap<String, Double>();
	  mutationRates.put("connections", 0.25);
	  mutationRates.put("link", 2.0);
	  mutationRates.put("bias", 0.4);
	  mutationRates.put("node", 0.5);
	  mutationRates.put("enable", 0.2);
	  mutationRates.put("disable", 0.4);
	  mutationRates.put("step", 0.1);
  }
}
