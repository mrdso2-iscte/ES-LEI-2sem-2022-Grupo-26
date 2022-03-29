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
 * --------------------
 * CompassPlotTest.java
 * --------------------
 * (C) Copyright 2003-2022, by David Gilbert and Contributors.
 *
 * Original Author:  David Gilbert;
 * Contributor(s):   -;
 *
 */

package org.jfree.chart.plot.compass;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.TestUtils;
import org.jfree.chart.internal.CloneUtils;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the {@link CompassPlot} class.
 */
public class CompassPlotTest {

    /**
     * Test the equals() method.
     */
    @Test
    public void testEquals() {
        CompassPlot plot1 = new CompassPlot();
        CompassPlot plot2 = new CompassPlot();
        assertEquals(plot1, plot2);

        // labelType...
        plot1.setLabelType(CompassPlot.VALUE_LABELS);
        assertNotEquals(plot1, plot2);
        plot2.setLabelType(CompassPlot.VALUE_LABELS);
        assertEquals(plot1, plot2);
        assertEquals(plot1.getLabelType(), CompassPlot.VALUE_LABELS);
        assertEquals(plot2.getLabelType(), CompassPlot.VALUE_LABELS);

        // labelFont
        Font lf = new Font("Serif", Font.PLAIN, 10);
        plot1.setLabelFont(lf);
        assertNotEquals(plot1, plot2);
        plot2.setLabelFont(lf);
        assertEquals(plot1, plot2);
        assertEquals(plot1.getLabelFont(), lf);
        assertEquals(plot2.getLabelFont(), lf);

        // drawBorder
        plot1.setDrawBorder(true);
        assertNotEquals(plot1, plot2);
        plot2.setDrawBorder(true);
        assertEquals(plot1, plot2);
        assertEquals(plot1.getDrawBorder(), true);
        assertEquals(plot1.getDrawBorder(), true);

        // rosePaint
        GradientPaint gpRose = new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW);
        plot1.setRosePaint(gpRose);
        assertNotEquals(plot1, plot2);
        plot2.setRosePaint(gpRose);
        assertEquals(plot1, plot2);      
        assertEquals(plot1.getRosePaint(), gpRose);
        assertEquals(plot2.getRosePaint(), gpRose);

        // roseCenterPaint
        GradientPaint gpCenter = new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW);
        plot1.setRoseCenterPaint(gpCenter);
        assertNotEquals(plot1, plot2);
        plot2.setRoseCenterPaint(gpCenter);
        assertEquals(plot1, plot2);
        assertEquals(plot1.getRoseCenterPaint(), gpCenter);
        assertEquals(plot2.getRoseCenterPaint(), gpCenter);

        // roseHighlightPaint
        GradientPaint gpHighlight = new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.YELLOW);
        plot1.setRoseHighlightPaint(gpHighlight);
        assertNotEquals(plot1, plot2);
        plot2.setRoseHighlightPaint(gpHighlight);
        assertEquals(plot1, plot2);
        assertEquals(plot1.getRoseHighlightPaint(), gpHighlight);
        assertEquals(plot2.getRoseHighlightPaint(), gpHighlight);
        
        //plotType
        assertEquals(plot1.getPlotType(), plot2.getPlotType());
        
        //Dataset
        ValueDataset vd = new DefaultValueDataset();
        MeterNeedle needle = null;
        plot1.addDataset(vd);
        plot1.addDataset(vd, needle);
        assertNotEquals(plot1, plot2);
        plot2.addDataset(vd);
        plot2.addDataset(vd, needle);
        assertEquals(plot1, plot2);
        
        //draw
        BufferedImage image = new BufferedImage(200, 400, BufferedImage.TYPE_INT_ARGB);        
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        Rectangle2D area = new Rectangle(200, 400);
        Point2D anchor = null;
        PlotState parentState = new PlotState();
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        plot1.draw(g2, area, anchor, parentState, info);
        plot1.draw(g2, area, anchor, parentState, info);

        
    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    @Test
    public void testSerialization() {
        CompassPlot p1 = new CompassPlot(null);
        p1.setRosePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE));
        p1.setRoseCenterPaint(new GradientPaint(4.0f, 3.0f, Color.RED, 2.0f,
                1.0f, Color.GREEN));
        p1.setRoseHighlightPaint(new GradientPaint(4.0f, 3.0f, Color.RED, 2.0f,
                1.0f, Color.GREEN));
        CompassPlot p2 = TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    /**
     * Confirm that cloning works.
     * @throws java.lang.CloneNotSupportedException
     */
    @Test
    public void testCloning() throws CloneNotSupportedException {
        CompassPlot p1 = new CompassPlot(new DefaultValueDataset(15.0));
        CompassPlot p2 = CloneUtils.clone(p1);
        assertNotSame(p1, p2);
        assertSame(p1.getClass(), p2.getClass());
        assertEquals(p1, p2);
    }

}
