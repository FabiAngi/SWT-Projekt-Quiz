package de.thm.iem.swt.flaggen_quiz.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class PrototypePictureServer {
	private ArrayList<String> ressources; 
	public PrototypePictureServer() {
		ressources = new ArrayList<String>();
		ressources.add("/Kroatien.png");
		ressources.add("/Ägypten.png");
		ressources.add("/Thailand.png");
		ressources.add("/Panama.png");
		ressources.add("/Kiribati.png");
		ressources.add("/Grönland.png");
	}
	
	public Image getPicture(int id) throws IOException {
		URL imagePath = getClass().getResource(ressources.get(id));
		return  new Image(imagePath.openStream());
	}
	
}
