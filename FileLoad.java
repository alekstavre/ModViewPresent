import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.util.logging.Logger;

public class FileLoad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOG = Logger.getLogger(FileLoad.class.getName());

	private boolean loaded;
	private String fileName;

	String loadData() {

		String dataFileName = this.fileName;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(dataFileName)))) {
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				sb.append(line).append('\n');

			}
			this.loaded = true;
			return sb.toString();
		} catch (Exception e) {
			LOG.warning("file not found");
		}
		return null;
	}

	void setFileName(String name) {
		this.fileName = name;
	}

	String getFileName() {
		return this.fileName;
	}

	boolean fileExists() {
		return new File(this.fileName).exists();
	}

	boolean isLoaded() {
		return this.loaded;
	}
}
