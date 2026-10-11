//  <editor-fold defaultstate="collapsed" desc="Do not read the code - use the Documentation Function.">
/**
 * This class provides an object buffer holding a double.
 */
public class Buffer {
	private double value;

	/**
	 * Initialise the buffer with a value of 0.
	 */
	public Buffer(){
		value = 0;
	}

	/**
	 * Initialise the buffer with a given double value.
	 * @param value The value to store.
	 */
	public Buffer(double value)
	{
		this.value = value;
	}

	/**
	 * Get the stored value from the buffer.
	 * @return The stored value.
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Set the stored value in the buffer.
	 * @param value The value to store.
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
// </editor-fold>