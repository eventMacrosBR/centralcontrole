package io.github.eventmacrosbr.centralcontrole.model.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.eventmacrosbr.centralcontrole.model.BotProfile;

public class Profiles {

	private List<BotProfile> profiles;
	
	public Profiles(){
		//TODO trazer isso de um arquivo de configurações
		profiles = new ArrayList<>();
		profiles.addAll(
				Arrays.asList(new BotProfile(),new BotProfile(),new BotProfile(),new BotProfile(),new BotProfile())
				);
		profiles.stream().forEach(p -> p.setName("Profile "+Math.random()));
	}
	
	public List<BotProfile> getProfiles() {
		
		return profiles;
	}

	public void remove(BotProfile botProfile) {
		profiles.remove(botProfile);
		System.out.println(botProfile);
		
	}

	public void addProfile(BotProfile botProfile) {
		profiles.add(botProfile);
	}
	
	

}
