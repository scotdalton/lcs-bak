/**
 * 
 */
package edu.nyu.cs.sysproj.arability.features;

import edu.nyu.cs.sysproj.arability.Image;

/**
 * @author Scot Dalton
 *
 */
public class GradientMagnitude extends Feature {

	@Override
	public void setValue(Image image) {
		Integer x = (Integer) options.get("x");
		Integer y = (Integer) options.get("y");
		Integer b = (Integer) options.get("b");
		value = 
			(float) image.getGradientMagnitude().getSample(x, y, b);
	}
	
	@Override
	public String toString() {
		return "GradientMagnitude" + options.values().toString();
	}
}