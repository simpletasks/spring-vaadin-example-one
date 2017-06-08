package hr.kruno.magazin.ui;

import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.v7.ui.Tree;


public class UniverseMenuFactory implements UIComponentBuilder {

	private class UniverseMenu extends VerticalLayout {
		
		private Tree mainMenu;
		
		public UniverseMenu init(){
			mainMenu = new Tree();
			return this;
			
		}
		
		public UniverseMenu layout(){
			
			setWidth("100%");
			setHeightUndefined();
			
			
			String rootStudent = "STUDENT";
			String leafAddStudent = "Add student";
			String leafRemoveStudent = "Remove student";
			String leafOperations = "Operations";
			
			String rootUniverity = "UNIVERITY";
			
			mainMenu.addItem(rootStudent);
			mainMenu.addItem(rootUniverity);
			
			mainMenu.expandItem(rootStudent);
			mainMenu.expandItem(rootUniverity);
			
			mainMenu.addItem(leafAddStudent);
			mainMenu.addItem(leafRemoveStudent);
			
			mainMenu.setChildrenAllowed(leafAddStudent, false);
			mainMenu.setChildrenAllowed(leafRemoveStudent, false);
			mainMenu.setParent(leafAddStudent, rootStudent);
			mainMenu.setParent(leafRemoveStudent, rootStudent);
			
			mainMenu.addItem(leafOperations);
			mainMenu.setChildrenAllowed(leafOperations, false);
			mainMenu.setParent(leafOperations, rootUniverity);
			
			addComponent(mainMenu);
			
			return this;
			
			
			
			
		}
	}
	
	public Component createComponent() {
		return  new UniverseMenu().init().layout();
	}

}
