package com.mac.bry.fx.trackPropertyChanges;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Point implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4390516583520360007L;
	
	private int x;
	
	private int y;
	
	private final PropertyChangeSupport pcsChangeSupport = new PropertyChangeSupport(this);

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public synchronized void addPropertyChangeListner(PropertyChangeListener listner) {
		pcsChangeSupport.addPropertyChangeListener(listner);
	}
	
	public synchronized void removePropertyChangeListner(PropertyChangeListener listner) {
		pcsChangeSupport.removePropertyChangeListener(listner);
	}
	
	public void setPointXY (int newX, int newY) {
		int oldX = this.x;
		int oldY = this.y;
		
		this.x = newX;
		this.y = newY;
		
		pcsChangeSupport.firePropertyChange("Point move in X ", Integer.valueOf(oldX), Integer.valueOf(newX));
		pcsChangeSupport.firePropertyChange("Point move in Y ", Integer.valueOf(oldY), Integer.valueOf(newY));
		
	}
	

}
