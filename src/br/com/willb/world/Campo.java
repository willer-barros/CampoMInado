package br.com.willb.world;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private int x, y;
	private boolean minado, marcado, aberto;
	
	private List<Campo> vizinhanca = new ArrayList<>();
	
	 Campo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	 
	 boolean addVizinho() {
		 return true;
	 }

}
