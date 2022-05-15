package org.jfree.chart.plot;

import java.awt.geom.Rectangle2D;
import java.io.Serializable;

import org.jfree.chart.event.PlotChangeEvent;

public class GapSpiderWebPlot implements Serializable {

	/** The default axis label gap (currently 10%). */
	public static final double DEFAULT_AXIS_LABEL_GAP = 0.10;

	/** The default interior gap. */
	public static final double DEFAULT_INTERIOR_GAP = 0.25;

	/** The maximum interior gap (currently 40%). */
	public static final double MAX_INTERIOR_GAP = 0.40;

	/** The space left around the outside of the plot as a percentage. */
	public double interiorGap;
	/** The gap between the labels and the axes as a %age of the radius. */
	public double axisLabelGap;
	
	private Plot swp;

	public GapSpiderWebPlot(Plot swp) {
		this.interiorGap = DEFAULT_INTERIOR_GAP;
		this.axisLabelGap = DEFAULT_AXIS_LABEL_GAP;
		this.swp=swp;
	}
	
	/**
     * Returns the interior gap, measured as a percentage of the available
     * drawing space.
     *
     * @return The gap (as a percentage of the available drawing space).
     *
     * @see #setInteriorGap(double)
     */
    public double getInteriorGap() {
        return this.interiorGap;
    }


	

	public double getMaxInteriorGap() {
		return MAX_INTERIOR_GAP;
	}
	
	public double gapHorizontal (Rectangle2D area) {
		return area.getWidth() * interiorGap;
	}
	public double gapVertical (Rectangle2D area) {
		return area.getHeight() * interiorGap;
	}
	
	   /**
     * Sets the interior gap and sends a {@link PlotChangeEvent} to all
     * registered listeners. This controls the space between the edges of the
     * plot and the plot area itself (the region where the axis labels appear).
     *
     * @param percent  the gap (as a percentage of the available drawing space).
     *
     * @see #getInteriorGap()
     */
    public void setInteriorGap(double percent) {
        if ((percent < 0.0) || (percent > getMaxInteriorGap())) {
            throw new IllegalArgumentException(
                    "Percentage outside valid range.");
        }
        if (interiorGap != percent) {
        	interiorGap = percent;
            swp.fireChangeEvent();
        }
    }
    
    
    /**
     * Sets the axis label gap and sends a {@link PlotChangeEvent} to all
     * registered listeners.
     *
     * @param gap  the gap.
     *
     * @see #getAxisLabelGap()
     */
    public void setAxisLabelGap(double gap) {
        axisLabelGap = gap;
        swp.fireChangeEvent();
    }

	
    
	
	
}