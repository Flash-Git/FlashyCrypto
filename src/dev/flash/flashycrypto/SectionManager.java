package dev.flash.flashycrypto;

import dev.flash.flashycrypto.sections.Section;

import java.awt.*;
import java.util.ArrayList;

public class SectionManager {
	
	private Handler handler;
	private ArrayList<Section> sections;
	
	public SectionManager(Handler handler) {
		this.handler = handler;
		sections = new ArrayList<>();
	}
	
	public void tick(double delta) {
		for(Section section : sections) {
			section.tick(delta);
		}
	}
	
	public void render(Graphics g) {
		for(Section section : sections) {
			section.render(g);
		}
	}
	
	public void add(Section section) {
		sections.add(section);
	}
	
	
}
