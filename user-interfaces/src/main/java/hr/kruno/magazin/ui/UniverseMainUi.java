package hr.kruno.magazin.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path=UniverseMainUi.NAME) // URL = localhost:8080/web/ui
@Title(value="MyApp1") // label in the browser tab where application is called
@Theme(value="valo")	// css library for visualization of vaadin components
public class UniverseMainUi extends UI{

	// will be a path of application
	public static final String NAME = "/ui";
	
	
	@Override
	protected void init(VaadinRequest request) {
		// this is where application starts
		VerticalLayout rootLayout = new VerticalLayout();
		rootLayout.addComponent(new Label("Yupi, it works!"));
		this.setContent(rootLayout);
		
	}

}
