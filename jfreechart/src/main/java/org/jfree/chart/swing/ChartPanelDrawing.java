package org.jfree.chart.swing;

import java.io.Serializable;

public class ChartPanelDrawing implements Serializable{
	/**
	 * The minimum width for drawing a chart (uses scaling for smaller widths).
	 */
	public int minimumDrawWidth;
	/**
	 * The minimum height for drawing a chart (uses scaling for smaller
	 * heights).
	 */
	public int minimumDrawHeight;
	

	/**
	 * The maximum width for drawing a chart (uses scaling for bigger
	 * widths).
	 */
	public int maximumDrawWidth;
	/**
	 * The maximum height for drawing a chart (uses scaling for bigger
	 * heights).
	 */
	public int maximumDrawHeight;

	public ChartPanelDrawing(int minimumDrawWidth, int minimumDrawHeight, int maximumDrawWidth,
			int maximumDrawHeight) {
		super();
		this.minimumDrawWidth = minimumDrawWidth;
		this.minimumDrawHeight = minimumDrawHeight;
		this.maximumDrawWidth = maximumDrawWidth;
		this.maximumDrawHeight = maximumDrawHeight;
	}
	
	
	/**
     * Returns the minimum drawing width for charts.
     * <P>
     * If the width available on the panel is less than this, then the chart is
     * drawn at the minimum width then scaled down to fit.
     *
     * @return The minimum drawing width.
     */
    public int getMinimumDrawWidth() {
        return this.minimumDrawWidth;
    }

    /**
     * Sets the minimum drawing width for the chart on this panel.
     * <P>
     * At the time the chart is drawn on the panel, if the available width is
     * less than this amount, the chart will be drawn using the minimum width
     * then scaled down to fit the available space.
     *
     * @param width  The width.
     */
    public void setMinimumDrawWidth(int width) {
        this.minimumDrawWidth = width;
    }

    /**
     * Returns the maximum drawing width for charts.
     * <P>
     * If the width available on the panel is greater than this, then the chart
     * is drawn at the maximum width then scaled up to fit.
     *
     * @return The maximum drawing width.
     */
    public int getMaximumDrawWidth() {
        return this.maximumDrawWidth;
    }

    /**
     * Sets the maximum drawing width for the chart on this panel.
     * <P>
     * At the time the chart is drawn on the panel, if the available width is
     * greater than this amount, the chart will be drawn using the maximum
     * width then scaled up to fit the available space.
     *
     * @param width  The width.
     */
    public void setMaximumDrawWidth(int width) {
        this.maximumDrawWidth = width;
    }

    /**
     * Returns the minimum drawing height for charts.
     * <P>
     * If the height available on the panel is less than this, then the chart
     * is drawn at the minimum height then scaled down to fit.
     *
     * @return The minimum drawing height.
     */
    public int getMinimumDrawHeight() {
        return this.minimumDrawHeight;
    }

    /**
     * Sets the minimum drawing height for the chart on this panel.
     * <P>
     * At the time the chart is drawn on the panel, if the available height is
     * less than this amount, the chart will be drawn using the minimum height
     * then scaled down to fit the available space.
     *
     * @param height  The height.
     */
    public void setMinimumDrawHeight(int height) {
        this.minimumDrawHeight = height;
    }

    /**
     * Returns the maximum drawing height for charts.
     * <P>
     * If the height available on the panel is greater than this, then the
     * chart is drawn at the maximum height then scaled up to fit.
     *
     * @return The maximum drawing height.
     */
    public int getMaximumDrawHeight() {
        return this.maximumDrawHeight;
    }

    /**
     * Sets the maximum drawing height for the chart on this panel.
     * <P>
     * At the time the chart is drawn on the panel, if the available height is
     * greater than this amount, the chart will be drawn using the maximum
     * height then scaled up to fit the available space.
     *
     * @param height  The height.
     */
    public void setMaximumDrawHeight(int height) {
        this.maximumDrawHeight = height;
    }
}
