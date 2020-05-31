package com.bridgeLabz.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operation {

	private static final String MATERIAL_PATH = "material.json";
	@SuppressWarnings("unused")
	private static List<Object> list = new ArrayList<>();

	public void addMaterial() {
		System.out.println("Enter id :");
		int id = Util.scanner.nextInt();
		System.out.println("Enter material Name :");
		String name = Util.scanner.next();
		Util.scanner.hasNextLine();
		System.out.println("Enter price :");
		double price = Util.scanner.nextDouble();
		Material materialObject = Material.createObject(id, name, price);
		Util.writeToFile(JsonUtil.convertObjectToJson(materialObject), MATERIAL_PATH);
	}

	public void updateMaterial() {
		String jsonFile = Util.readFile(MATERIAL_PATH);
		list = convertToArrayList(jsonFile);
		System.out.println("Enter name :");

	}

	public List<Object> convertToArrayList(String jsonString) {
		Object materialObject = JsonUtil.convertJsonToObject(MATERIAL_PATH, Material[].class);
		return Arrays.asList(materialObject);

	}
//	private int find(List<Material> list, String name) {
//		for(int i = 0; i <= list.size(); i++) {
//			if(list.get(i).getName().equalsIgnoreCase(name)){
//				return i;
//			}
//		}
//		return -1;
//	}
//	

}
