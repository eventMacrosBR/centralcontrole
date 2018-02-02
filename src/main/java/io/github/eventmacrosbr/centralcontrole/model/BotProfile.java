package io.github.eventmacrosbr.centralcontrole.model;

public class BotProfile {

	private String name;
	private boolean useWx;
	private boolean useLocalRagnarok;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isUseWx() {
		return useWx;
	}

	public void setUseWx(boolean useWx) {
		this.useWx = useWx;
	}

	public boolean isUseLocalRagnarok() {
		return useLocalRagnarok;
	}

	public void setUseLocalRagnarok(boolean useLocalRagnarok) {
		this.useLocalRagnarok = useLocalRagnarok;
	}

	@Override
	public String toString() {
		return getName();
	}

}
