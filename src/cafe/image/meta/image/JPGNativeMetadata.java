/**
 * Copyright (c) 2014-2015 by Wen Yu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Any modifications to this file must keep this entire header intact.
 */

package cafe.image.meta.image;

import java.util.List;

import cafe.image.jpeg.Segment;
import cafe.image.meta.NativeMetadata;

/**
 * JPEG native image metadata
 * 
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 03/06/2015
 */
public class JPGNativeMetadata extends NativeMetadata<Segment> {
	
	public JPGNativeMetadata() {
		;
	}

	public JPGNativeMetadata(List<Segment> segments) {
		super(segments);
	}
	
	@Override
	public String getMimeType() {
		return "image/jpg";
	}
}