package io.github.eventmacrosbr.centralcontrole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import io.github.eventmacrosbr.centralcontrole.model.BotProfile;
import io.github.eventmacrosbr.centralcontrole.model.repository.Profiles;
import io.github.eventmacrosbr.centralcontrole.service.OpenkoreService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

@FXMLController
public class MainController {
	
	@FXML
	private TextField profileName; 
	
	@FXML
	private ListView<BotProfile> profileList;
	
	@FXML
	private CheckBox useWx;
	
	@FXML
	private CheckBox useLocalRagnarok;
	
	@FXML
	private Label status;
	
	@Autowired
	private Profiles profileManager;
	
	@Autowired
	private OpenkoreService openkoreService;
	
	@FXML
	public void initialize() {
		status.setText("Inicializando openkore");
		if(!openkoreService.isInitilized()) {
			status.setText("Repositório local do openkore não localizado. Baixando...");
			openkoreService.init();
		}
		status.setText("Openkore inicializado! Verificando atualizações...");
		openkoreService.safePull();
		status.setText("Openkore inicializado e atualizado");
		updateProfileList();
	}
	
	public void updateProfileList() {
		clearFields();
		
		List<BotProfile> profiles = profileManager.getProfiles();
		
		ObservableList<BotProfile> observableArrayList = FXCollections.observableArrayList(profiles);
		profileList.setItems(observableArrayList);
		
		
	}
	
	private void clearFields() {
		profileList.setItems(null);
		profileName.setText("");
		useLocalRagnarok.setSelected(false);
		useWx.setSelected(false);
		
	}

	public void newProfile() {
		BotProfile botProfile = new BotProfile();
		botProfile.setName("NOVO");
		profileManager.addProfile(botProfile);
		updateProfileList();
		profileList.getSelectionModel().select(botProfile);
	}
	
	public void config() {
		
	}

	public void exit() {
		
	}
	
	public void deleteProfile() {
		BotProfile botProfile = profileList.getSelectionModel().getSelectedItem();
		profileManager.remove(botProfile);
		updateProfileList();
	}
	
	public void startProfile() {
		
	}
}
