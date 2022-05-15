package org.jfree.chart.renderer.category;

import java.io.Serializable;

import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.internal.Args;


public class Bar implements Serializable{	
	/** The margin between items (bars) within a category. */
	public double itemMargin;
	/** A flag that controls whether or not bar outlines are drawn. */
	public boolean drawBarOutline;
	/** The maximum bar width as a percentage of the available space. */
	public double maximumBarWidth;
	/** The minimum bar length (in Java2D units). */
	public double minimumBarLength;
	/** The base value for the bars (defaults to 0.0). */
	public double base;
	/**
	 * A flag that controls whether the base value is included in the range
	 * returned by the findRangeBounds() method.
	 */
	public boolean includeBaseInRange;
	/**
	 * The bar painter (never {@code null}).
	 */
	
	public Bar(double base, boolean includeBaseInRange, double itemMargin, boolean drawBarOutline, double maximumBarWidth, double minimumBarLength) {
		this.base = base;
        this.includeBaseInRange = includeBaseInRange;
        this.itemMargin = itemMargin;
        this.drawBarOutline = drawBarOutline;
        this.maximumBarWidth = maximumBarWidth;
        this.minimumBarLength = minimumBarLength;
        
	}

    
}