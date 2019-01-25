package service;

import service.impl.GenereService;

public abstract class ServiceFactory {
	
	private static final IGenereService GENERE_SERVICE = new GenereService();
	
	public static IGenereService getGenereService() {
		return GENERE_SERVICE;
	}
}
