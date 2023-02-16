package se.ecostruxure.sdk.example;


import se.ecostruxure.sdk.client.invoker.*;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.ecostruxure.sdk.client.SiteApi;

public class GetSites {
	public static void main(String[] args) {
		String token = null;
        String baseUrl = null;
        
        for (int i=0;i<args.length;i++) {
            String[] arr = args[i].split("=");
            
            switch(arr[0]) {
            case TOKEN_NAME:
                token = findArgument(arr);
                break;
            case BASEURL_NAME:
                baseUrl = findArgument(arr);
                break;
            default: break;
            }
         }
        
      //To check the null conditions
        if (Boolean.TRUE.equals(checkNull(token))) {
            statusMessage(TOKEN_NAME);
            return;
        }
       if (Boolean.TRUE.equals(checkNull(baseUrl))) {
           statusMessage(BASEURL_NAME);
           return;
       }
        
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(baseUrl);

        // Configure HTTP bearer authorization: PersonalAccessToken
        HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
        PersonalAccessToken.setBearerToken(token);

        SiteApi apiInstance = new SiteApi(defaultClient);
        
        // String 
        try {
        	List<Site> result = apiInstance.listSites();
            System.out.println(result);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
	
	/**
     * statusMessage.
     * @param argument
     */
	private static void statusMessage(String argument) {
        String errorMessage = null;
        errorMessage = argument.concat(" cannot be empty");
        System.out.println(getDetailsErrorMessage(errorMessage));
    }
	/**
     * @param errorMessage
     * @return Map
     */
	public static Map<String,Object> getDetailsErrorMessage(String errorMessage) {
        Map<String,Object> details = new HashMap<>();
        details.put("type","/GetSites");
        details.put("title",BAD_REQUEST);
        details.put("status",STATUS);
        details.put("detail",errorMessage);
        return details;
    }
	/**
     * check the value null.
     * @param arguments
     * @return
     */
	public static Boolean checkNull(String arguments) {
        if(arguments == null) {
            return true;
        }
        return false;
    }
	/**
     * findArgument.
     * @param arr String Array
     * @return
     */
	private static String findArgument(String[] arr) {
        String values = null;
        if (arr.length == 2) {
            values = arr[1];
        }
        return values;
    }
	// Constants
	private static final String TOKEN_NAME = "token";
    private static final String BASEURL_NAME = "baseUrl";
    private static final String BAD_REQUEST = "Bad Request";
    private static final Integer STATUS = 400;
}

