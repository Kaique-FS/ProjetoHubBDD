package br.com.rsinet.hub.projetobdd.managers;

import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.dataProvider.JsonDataReader;

public class FileReaderManager {

	private static FileReaderManager FRM = new FileReaderManager();
	private static ConfigFileReader CFR;
	private static JsonDataReader JDR;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return FRM;
	}

	public ConfigFileReader getConfigReader() {
		return (CFR == null) ? new ConfigFileReader() : CFR;
	}

	public JsonDataReader getJsonReader() {
		return (JDR == null) ? new JsonDataReader() : JDR;
	}
}
