/**
 * Unit tests for the {@link Computer} class.
 * 
 * @author Logan Cooper (pid)
 * @author Author 2's name (pid)
 * @version (place the date here, in this format: yyyy.mm.dd)
 */
public class Computer {
	private String processor;
	private int numCores;
	private double processorSpeed;

	/**
	 * @param processor
	 * @param numCores
	 * @param processorSpeed
	 */
	public Computer(String processor, int numCores, int processorSpeed) {
		this.setProcessor(processor);
		this.setNumCores(numCores);
		this.setProcessorSpeed(processorSpeed);
	}

	/**
	 * @return prcessorSpeed
	 */
	public double getProcessorSpeed() {
		return processorSpeed;
	}

	/**
	 * @param processorSpeed
	 */
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	/**
	 * @return numCores
	 */
	public int getNumCores() {
		return numCores;
	}

	/**
	 * @param numCores
	 */
	public void setNumCores(int numCores) {
		this.numCores = numCores;
	}

	/**
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @param processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double computePower() {
		return processorSpeed * (double) (numCores);
	}

	public String toString() {
		return processor + ", " + numCores + " cores at " + processorSpeed + "GHz";
	}

}
