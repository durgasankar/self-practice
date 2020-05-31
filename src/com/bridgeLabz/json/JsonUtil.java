package com.bridgeLabz.json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
	}

	public static String convertObjectToJson(Object javaObject) {
		String jsonString = "";

		try {
			jsonString = mapper.writeValueAsString(javaObject);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonString;
	}

	public static <G> G convertJsonToObject(String jsonString, Class<G> cls) {
		G result = null;

		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <G> G[] convertJsonArrayToObject(String jsonString, Class<G> cls) {
		G[] result = null;
		
		try {
			result = (G[]) mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return result;
	}

}
