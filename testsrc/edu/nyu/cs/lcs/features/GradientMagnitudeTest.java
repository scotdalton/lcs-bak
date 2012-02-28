/**
 * 
 */
package edu.nyu.cs.lcs.features;

import org.junit.Test;

import edu.nyu.cs.lcs.Image;
import edu.nyu.cs.lcs.TestUtility;


/**
 * @author Scot Dalton
 *
 */
public class GradientMagnitudeTest {
	@Test
	public void testGradientMagnitude() {
//		for(Image image: TestUtility.getTestImage1().getChoppedImages()) {
		Image image = TestUtility.getTestImage1().getChoppedImages().get(0);
		System.out.println(image.getGradientMagnitude().getDownSample(0, 0, 0));
		float[] pixels = 
			image.getGradientMagnitude().getPixels((float[]) null);
		for(float pixel: pixels)
			System.out.println(pixel);
//		}
	}
}
