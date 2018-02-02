package io.github.eventmacrosbr.centralcontrole.service;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

public class OpenkoreService implements GitService {

	private Git git;

	@Override
	public boolean isInitilized() {
		try {
			git = Git.open(new File("openkore"));
			git.getRepository();
			return true;
		} catch (IOException e) {
			return false;
		}

	}

	@Override
	public void init() {
		try {
			git = Git.cloneRepository().setURI("https://github.com/Openkore/openkore").call();
		} catch (GitAPIException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void safePull() {
		try {
			git.stashCreate().call();
			git.pull().call();
		} catch (GitAPIException e) {
			throw new RuntimeException(e);
		}

	}
}
