package de.thm.iem.swt.flaggen_quiz.view;

import java.util.Map;
import javafx.scene.Node;

public interface View {
	public Node getContent();
	public Map<String,Node> getControls();
}