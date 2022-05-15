package org.jfree.chart.swing;

import java.io.Serializable;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ChartPanelJMenuZoom implements Serializable{
	/** Menu item for zooming in on a chart (both axes). */
	public JMenuItem zoomInBothMenuItem;
	/** Menu item for zooming in on a chart (domain axis). */
	public JMenuItem zoomInDomainMenuItem;
	/** Menu item for zooming in on a chart (range axis). */
	public JMenuItem zoomInRangeMenuItem;
	/** Menu item for zooming out on a chart. */
	public JMenuItem zoomOutBothMenuItem;
	/** Menu item for zooming out on a chart (domain axis). */
	public JMenuItem zoomOutDomainMenuItem;
	/** Menu item for zooming out on a chart (range axis). */
	public JMenuItem zoomOutRangeMenuItem;
	/** Menu item for resetting the zoom (both axes). */
	public JMenuItem zoomResetBothMenuItem;
	/** Menu item for resetting the zoom (domain axis only). */
	public JMenuItem zoomResetDomainMenuItem;
	/** Menu item for resetting the zoom (range axis only). */
	public JMenuItem zoomResetRangeMenuItem;
	
	public ChartPanelJMenuZoom(JMenuItem zoomInBothMenuItem, JMenuItem zoomInDomainMenuItem,
			JMenuItem zoomInRangeMenuItem, JMenuItem zoomOutBothMenuItem, JMenuItem zoomOutDomainMenuItem,
			JMenuItem zoomOutRangeMenuItem, JMenuItem zoomResetBothMenuItem, JMenuItem zoomResetDomainMenuItem,
			JMenuItem zoomResetRangeMenuItem) {
		this.zoomInBothMenuItem = zoomInBothMenuItem;
		this.zoomInDomainMenuItem = zoomInDomainMenuItem;
		this.zoomInRangeMenuItem = zoomInRangeMenuItem;
		this.zoomOutBothMenuItem = zoomOutBothMenuItem;
		this.zoomOutDomainMenuItem = zoomOutDomainMenuItem;
		this.zoomOutRangeMenuItem = zoomOutRangeMenuItem;
		this.zoomResetBothMenuItem = zoomResetBothMenuItem;
		this.zoomResetDomainMenuItem = zoomResetDomainMenuItem;
		this.zoomResetRangeMenuItem = zoomResetRangeMenuItem;
	}

	public JMenuItem getZoomInBothMenuItem() {
		return zoomInBothMenuItem;
	}

	public JMenuItem getZoomInDomainMenuItem() {
		return zoomInDomainMenuItem;
	}

	public JMenuItem getZoomInRangeMenuItem() {
		return zoomInRangeMenuItem;
	}

	public JMenuItem getZoomOutBothMenuItem() {
		return zoomOutBothMenuItem;
	}

	public JMenuItem getZoomOutDomainMenuItem() {
		return zoomOutDomainMenuItem;
	}

	public JMenuItem getZoomOutRangeMenuItem() {
		return zoomOutRangeMenuItem;
	}

	public JMenuItem getZoomResetBothMenuItem() {
		return zoomResetBothMenuItem;
	}

	public JMenuItem getZoomResetDomainMenuItem() {
		return zoomResetDomainMenuItem;
	}

	public JMenuItem getZoomResetRangeMenuItem() {
		return zoomResetRangeMenuItem;
	}
	
	public void setActions(JMenuItem item, String command, ChartPanel chartPanel, JMenu zoomInMenu) {
		item.setActionCommand(command);
        item.addActionListener(chartPanel);
        zoomInMenu.add(item);
	}
	
}