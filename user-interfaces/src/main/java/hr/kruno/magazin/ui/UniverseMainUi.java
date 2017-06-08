package hr.kruno.magazin.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path=UniverseMainUi.NAME) // URL = localhost:8080/web/ui
@Title(value="MyApp1") // label in the browser tab where application is called
@Theme(value="valo")	// css library for visualization of vaadin components
public class UniverseMainUi extends UI{

	// will be a path of application
	public static final String NAME = "/ui";
	
	@Autowired
	private UniverseLogoLayoutFactory universeLogoLayoutFactory;
	
	@Autowired
	private UniverseMenuFactory universeMenuFactory;
	
	
	private Panel changeTab = new Panel();
	
	@Override
	protected void init(VaadinRequest request) {
		// this is where application starts
		VerticalLayout rootLayout = new VerticalLayout();
		rootLayout.setSizeFull();
		rootLayout.setMargin(true);
		
		Panel contentPanel = new Panel();
		contentPanel.setWidth("75%");
		contentPanel.setHeight("100%");
		
		Panel logoPanel = new Panel();
		logoPanel.setWidth("75%");
		logoPanel.setHeightUndefined();
		
		HorizontalLayout uiLayout = new HorizontalLayout();
		uiLayout.setSizeFull();
		uiLayout.setMargin(true);
		
		Component logo = universeLogoLayoutFactory.createComponent();
		Component menu = universeMenuFactory.createComponent();
		
		uiLayout.addComponent(menu);
		uiLayout.addComponent(changeTab);
		
		uiLayout.setComponentAlignment(changeTab, Alignment.TOP_CENTER);
		uiLayout.setComponentAlignment(menu, Alignment.TOP_CENTER);
		
		uiLayout.setExpandRatio(menu, 1);
		uiLayout.setExpandRatio(changeTab, 2);
		
		logoPanel.setContent(logo);
		contentPanel.setContent(uiLayout);
		
		rootLayout.addComponent(logoPanel);
		rootLayout.addComponent(contentPanel);
		rootLayout.setComponentAlignment(contentPanel, Alignment.MIDDLE_CENTER);
		rootLayout.setComponentAlignment(logoPanel, Alignment.TOP_CENTER);
		rootLayout.setExpandRatio(contentPanel, 1);
		
		this.setContent(rootLayout);
		
	}
	
}
