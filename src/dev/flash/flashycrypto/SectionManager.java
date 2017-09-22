package dev.flash.flashycrypto;

import dev.flash.flashycrypto.sections.Section;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SectionManager {
	
	public static final int TOP_LEFT = 0;
	public static final int TOP_RIGHT = 1;
	
	private Handler handler;
	private ArrayList<Section> sections;
	private int mode;
	
	
	public SectionManager(Handler handler) {
		this.handler = handler;
		sections = new ArrayList<>();
		mode = TOP_LEFT;
	}
	
	public void tick(double delta) {
		
		arrange();
		
		for(Section section : sections) {
			section.tick(delta);
		}
		
	}
	
	public void render(Graphics g) {
		for(Section section : sections) {
			section.render(g);
		}
	}
	
	
	private void arrange() {
		Collections.sort(sections, (s1, s2) -> (int) (s1.getX()-s2.getX()));
		float lastX = 0;
		float lastW = 0;
		float gap = 10;
		
		for(Section section : sections){
			section.setX(lastX+lastW+gap);
			lastX = section.getX();
			lastW = section.getWidth();
		}
	}
	
	
	public void add(Section section) {
		sections.add(section);
	}
	
	//G and S
	
	public int getMode() {
		return mode;
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}
}
