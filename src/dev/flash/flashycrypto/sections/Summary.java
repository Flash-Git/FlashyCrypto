package dev.flash.flashycrypto.sections;

import java.awt.*;

public class Summary extends Section {

	
	private final static int DEFAULT_X = 260;
	private final static int DEFAULT_Y = 60;
	private final static int DEFAULT_W = 400;
	private final static int DEFAULT_H = 600;
	
	public Summary(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public Summary() {
		super(DEFAULT_X, DEFAULT_Y, DEFAULT_W, DEFAULT_H);
		
	}
	
	public void tick(double delta){
	
	}
	
	public void render(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
	
	
	
}
