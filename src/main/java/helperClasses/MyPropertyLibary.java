package helperClasses;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyPropertyLibary {

	public static String getPropertyName(final String name) {
		return name.toUpperCase();
	}
	

	public static String getPropertyFileName(final String fileName) {
		return fileName.toLowerCase() + ".property";
	}
	
	public static File createNewPropertyFile(final String fileName, final String directory) {
		//TODO implement create new file in the given directory
		return new File("");
	}
	
	public static File createNewPropertyFile(final String fileName, final String directory, final String... properyName) {
		List propertys = new ArrayList<Object>();
		
		File file = createNewPropertyFile(fileName, directory);
		
		for(String property: properyName){
			propertys.add(getPropertyName(property));
		}
		
		if(!propertys.isEmpty()){
			// Save into new File
		}
		return file;
	}
	
	
	private File createNewHiddenDirectory(final String directoryName, final String directoryPath){
		return new File(directoryPath + "/." + directoryName);
	}
	
	
	/**
	 * Laod the property from the File.
	 * @param properyName
	 * @param properyFile
	 * @return
	 */
	public static String loadProperty(final String properyName, final String properyFile) {


		return "";
	}
	
	/**
	 * Save the String into the ProperyFile
	 * @param properyName
	 * @param properyFile
	 * @return
	 */
	public static String saveProperty(String properyName, final String properyFile) {
		return properyName = properyName.toUpperCase();
	}

	
}
