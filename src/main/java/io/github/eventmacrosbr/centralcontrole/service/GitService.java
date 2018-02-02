package io.github.eventmacrosbr.centralcontrole.service;

public interface GitService {
	
	boolean isInitilized();
	
	void init();
	
	void safePull();

}
