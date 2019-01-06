package org.bmod.simulation;

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

public class GenerationHelper {
	// REQUIRES: Working Directory = Workspace Folder
	public static Map<String, String> files() throws URISyntaxException, IOException {
		String xtext_pack = "org.xtext.bmod";
		String pack = GenerationHelper.class.getPackage().getName();
		Path path = Paths.get(xtext_pack + "/src/" + pack.replace(".", "/"));
		File folder = new File(path.toString());
		
		Map<String, String> filecontents = new HashMap<String, String>();
		for(File file: folder.listFiles()) {
			filecontents.put(pack.replace(".", "/") + "/" + file.getName(), getContents(file, StandardCharsets.UTF_8));
		}
		return filecontents;
	}
	
	private static String getContents(File file, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
		return new String(encoded, encoding);
	}
}
