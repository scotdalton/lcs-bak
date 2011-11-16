/**
 * 
 */
package edu.nyu.cs.sysproj.arability;

import java.io.File;

/**
 * KnownImage extends Image for training and testing images.
 *  
 * @author Scot Dalton
 * 
 */
public class KnownImage extends Image {

	public KnownImage(File imageFile, ArabilityClassification classfication) {
		super(imageFile, classfication);
	}
}