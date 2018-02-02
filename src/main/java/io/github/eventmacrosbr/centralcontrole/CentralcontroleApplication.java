package io.github.eventmacrosbr.centralcontrole;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import io.github.eventmacrosbr.centralcontrole.view.MainView;

@SpringBootApplication
public class CentralcontroleApplication extends AbstractJavaFxApplicationSupport{

	public static void main(String[] args) {
		launchApp(CentralcontroleApplication.class, MainView.class, args);
	}
}
