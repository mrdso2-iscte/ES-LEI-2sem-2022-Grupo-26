/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2022, by David Gilbert and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 * -----------------------
 * ShortTextTitleTest.java
 * -----------------------
 * (C) Copyright 2008-2022, by David Gilbert and Contributors.
 *
 * Original Author:  David Gilbert;
 * Contributor(s):   -;
 *
 */

package org.jfree.chart.title;

import org.jfree.chart.TestUtils;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.block.Size2D;
import org.jfree.chart.internal.CloneUtils;
import org.jfree.data.Range;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * Tests for the {@link ShortTextTitle} class.
 */
public class ShortTextTitleTest {

	/**
	 * Check that the equals() method distinguishes all fields.
	 */
	@Test
	public void testEquals() {
		ShortTextTitle t1 = new ShortTextTitle("ABC");
		ShortTextTitle t2 = new ShortTextTitle("ABC");
		assertEquals(t1, t2);

		t1.setText("Test 1");
		assertNotEquals(t1, t2);
		t2.setText("Test 1");
		assertEquals(t1, t2);

		BufferedImage image = new BufferedImage(200, 300, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D) image.getGraphics();

		Size2D s1 = t1.arrangeNN(g2);
		Size2D s2 = t2.arrangeNN(g2);
		assertEquals(s1, s2);

		Range range = new Range(0.5, 5.0);
		Size2D s3 = t1.arrangeRN(g2, range);
		assertNotEquals(s2, s3);
		Size2D s4 = t2.arrangeRN(g2, range);
		assertEquals(s3, s4);

		Rectangle2D area = new Rectangle(200, 400);
		Rectangle2D areaNull = new Rectangle();
		Object obj1 = t1.draw(g2, area, null);
		Object obj2 = t2.draw(g2, areaNull, null);
		assertEquals(obj1, obj2);
		obj2 = t2.draw(g2, area, null);
		assertEquals(obj1, obj2);

		RectangleConstraint constraint = new RectangleConstraint(0.0, 0.0);

//		assertThrows(RuntimeException.class, () -> {
//			Size2D s5 = t1.arrange(g2, constraint);
//			
//		});

	}

	/**
	 * Two objects that are equal are required to return the same hashCode.
	 */
	@Test
	public void testHashcode() {
		ShortTextTitle t1 = new ShortTextTitle("ABC");
		ShortTextTitle t2 = new ShortTextTitle("ABC");
		assertEquals(t1, t2);
		int h1 = t1.hashCode();
		int h2 = t2.hashCode();
		assertEquals(h1, h2);

	}

	/**
	 * Confirm that cloning works.
	 */
	@Test
	public void testCloning() throws CloneNotSupportedException {
		ShortTextTitle t1 = new ShortTextTitle("ABC");
		ShortTextTitle t2 = CloneUtils.clone(t1);
		assertNotSame(t1, t2);
		assertSame(t1.getClass(), t2.getClass());
		assertEquals(t1, t2);
	}

	/**
	 * Serialize an instance, restore it, and check for equality.
	 */
	@Test
	public void testSerialization() {
		ShortTextTitle t1 = new ShortTextTitle("ABC");
		ShortTextTitle t2 = TestUtils.serialised(t1);
		assertEquals(t1, t2);
	}

}
