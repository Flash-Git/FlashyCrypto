package dev.flash.flashycrypto.sections;

import java.awt.*;

public class Summary extends Section {
	
	private final static float DEFAULT_X = 260;
	private final static float DEFAULT_Y = 60;
	private final static float DEFAULT_W = 400;
	private final static float DEFAULT_H = 600;
	public final static float DEFAULT_RATIO = 400/600;
	
	public Summary(float x, float y, float width, float height) {
		super(x, y, width, height);
		
	}
	
	public Summary() {
		super(DEFAULT_X, DEFAULT_Y, DEFAULT_W, DEFAULT_H);
		
	}
	
	public void tick(double delta) {
	
	}
	
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) x, (int) y, (int) width, (int) height);
	}
	
	
}
