package br.com.rsinet.hub.projetobdd.managers;

import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager FRM = new FileReaderManager();
	private static ConfigFileReader CFR;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return FRM;
	}

	public ConfigFileReader getConfigReader() {
		return (CFR == null) ? new ConfigFileReader() : CFR;
	}
}
