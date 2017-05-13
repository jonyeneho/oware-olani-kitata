
public class Storehouse
{
	private int numSeeds;
	private Pit pit;

	
	public void addCapturedSeeds(int n){
		numSeeds += n;
	}
	
	public void setNumSeeds(int seeds){
		this.numSeeds =seeds;
	}

	
	public int getNumSeeds(){
		return this.numSeeds;
	}
	
	

}
