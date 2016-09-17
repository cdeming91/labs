package Lab15;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class CountriesTextFile {

	private Path filePath;

	public CountriesTextFile(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	public CountriesTextFile() {
		this("C:\\Users\\Administrataor\\workspace\\Labs\\src\\Lab15\\countries.txt");
	}

	public ArrayList<String> getCountryList() {
		ArrayList<String> countries = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return countries;
		}

		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();
			while (line != null) {
				countries.add(line);
				line = reader.readLine();
			}
			reader.close();
			return countries;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read country list.", ex);
		}
	}

	public void saveCountryList(String country) {
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath.toString(), true)));
			writer.println(country);
			writer.close();
		} catch (IOException ex) {
			throw new RuntimeException("Unable to save countries.", ex);
		}
	}
}