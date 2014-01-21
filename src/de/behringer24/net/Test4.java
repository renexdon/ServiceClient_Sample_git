package de.behringer24.net;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

import de.behringer24.net.ServiceClient;

public class Test4{
    public static void main(String[] args)  {
  	ServiceClient service = new ServiceClient("http://yoursite.com/api/service", RequestMethod.POST);
	service.addParameter("name", "Max Mustermann");
	service.addParameter("email", "max@mustermann.com");

	try {
   		 String response = service.requestJson();
	} catch (IOException e) {
  	  // handle connection errors
	} catch (JSONException e){
    	// handle JSON parse errors
	}	
     }
}
