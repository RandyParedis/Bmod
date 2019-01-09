package org.xtext.bmod.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CppGenerationHelper {
	// REQUIRES: Working Directory = Workspace Folder
	public static Map<String, String> files() throws URISyntaxException, IOException {
		String xtext_pack = "org.xtext.bmod";
		Path path = Paths.get(xtext_pack + "/src/org/bmod/simulation/cpp");
		File folder = new File(path.toString());
		
		Map<String, String> filecontents = new HashMap<String, String>();
		recursable(filecontents, folder, "");
		return filecontents;
	}
	
	private static void recursable(Map<String, String> filecontents, File folder, String prepend) throws IOException {
		for(File file: folder.listFiles()) {
			if(file.isFile()) {
				filecontents.put(prepend + file.getName(), getContents(file, StandardCharsets.UTF_8));
			} else if(file.isDirectory()) {
				recursable(filecontents, file, file.getName() + "/" + prepend);
			}
		}
	}
	
	private static String getContents(File file, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
		return new String(encoded, encoding);
	}
}
