package org.jfree.chart.renderer.xy;

import java.io.Serializable;

public class XYBarRendererShadows implements Serializable {
	
	/**
     * The default value for the initialisation of the shadowsVisible flag.
     */
	private static boolean defaultShadowsVisible = true;

	/**
	 * The flag that controls whether or not shadows are drawn for the bars.
	 */
	public boolean shadowsVisible;
	/**
	 * The x-offset for the shadow effect.
	 */
	public double shadowXOffset;
	/**
	 * The y-offset for the shadow effect.
	 */
	public double shadowYOffset;

	public XYBarRendererShadows(double shadowXOffset, double shadowYOffset) {
		this.shadowsVisible = defaultShadowsVisible;
		this.shadowXOffset = shadowXOffset;
		this.shadowYOffset = shadowYOffset;
 	}
	
	public XYBarRendererShadows(boolean shadowsVisible, double shadowXOffset, double shadowYOffset) {
		this.shadowsVisible = shadowsVisible;
		this.shadowXOffset = shadowXOffset;
		this.shadowYOffset = shadowYOffset;
 	}
	
    /**
     * Returns the default value for the {@code shadowsVisible} flag.
     *
     * @return A boolean.
     *
     * @see #setDefaultShadowsVisible(boolean)
     */
    public static boolean getDefaultShadowsVisible() {
        return defaultShadowsVisible;
    }

    /**
     * Sets the default value for the shadows visible flag.
     *
     * @param visible  the new value for the default.
     *
     * @see #getDefaultShadowsVisible()
     */
    public static void setDefaultShadowsVisible(boolean visible) {
        defaultShadowsVisible = visible;
    }
    
    /**
     * Returns the flag that controls whether or not shadows are drawn for
     * the bars.
     *
     * @return A boolean.
     */
    public boolean getShadowsVisible() {
        return this.shadowsVisible;
    }
    

    /**
     * Returns the shadow x-offset.
     *
     * @return The shadow x-offset.
     */
    public double getShadowXOffset() {
        return this.shadowXOffset;
    }
    
    /**
     * Returns the shadow y-offset.
     *
     * @return The shadow y-offset.
     */
    public double getShadowYOffset() {
        return this.shadowYOffset;
    }

	
}