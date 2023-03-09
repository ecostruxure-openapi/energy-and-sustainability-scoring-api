package se.ecostruxure.sdk.client.invoker;

import se.ecostruxure.sdk.client.invoker.ApiClient;

public class Configuration {
	private static ApiClient defaultApiClient ;
	public static synchronized ApiClient getDefaultApiClient() {
		if (defaultApiClient == null) {
			defaultApiClient = new ApiClient();
		}
		return defaultApiClient;
	}
	
}