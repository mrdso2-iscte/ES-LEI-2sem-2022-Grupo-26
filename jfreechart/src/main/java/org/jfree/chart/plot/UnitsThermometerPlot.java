package org.jfree.chart.plot;

import java.io.Serializable;

public class UnitsThermometerPlot implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** The display units */
	public int units;
	private Plot plot;

	public UnitsThermometerPlot(Plot plot, int units) {
		this.units = units;
		this.plot=plot;
	}
	
	 /**
     * Sets the units to be displayed in the thermometer. Use one of the
     * following constants:
     *
     * <ul>
     * <li>UNITS_NONE : no units displayed.</li>
     * <li>UNITS_FAHRENHEIT : units displayed in Fahrenheit.</li>
     * <li>UNITS_CELCIUS : units displayed in Celcius.</li>
     * <li>UNITS_KELVIN : units displayed in Kelvin.</li>
     * </ul>
     *
     * @param u  the new unit type.
     *
     * @see #getUnits()
     */
	
	
	 /**
     * Returns a code indicating the unit display type.  This is one of
     * {@link #UNITS_NONE}, {@link #UNITS_FAHRENHEIT}, {@link #UNITS_CELCIUS}
     * and {@link #UNITS_KELVIN}.
     *
     * @return The units type.
     *
     * @see #setUnits(int)
     */
    public int getUnits() {
        return this.units;
    }
    
    
 

    
    public void setUnits(int u) {
        if ((u >= 0) && (u < Units.UNITS.length)) {
            if (this.units != u) {
                this.units = u;
                plot.fireChangeEvent();
            }
        }
    }

}