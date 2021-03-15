package com.mac.bry.fx.trackPropertyChanges;

public class Test {

	public static void main(String[] args) {
		
		Point point = new Point(0, 0);
		
		point.addPropertyChangeListner(evt -> { Integer newValueInteger = (Integer) evt.getNewValue();
		System.out.println(newValueInteger);
		});
		
		for (int i = 0; i < 1000; i++) {
			point.setPointXY(i * 2, i * 10);
		}
	}

}
