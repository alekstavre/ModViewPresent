import java.io.Serializable;

public class FileSelPresent implements Serializable {

	private FileSelView view;
	private FileLoad loader;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileSelPresent(FileSelView view) {
		this.view = view;
	}

	public void setLoader(FileLoad loader) {
		this.loader = loader;
	}

	public void start() {
		view.setPresenter(this);
		view.open();
	}

	public void fileNameChanged() {
		loader.setFileName(view.getFIleName());

	}

	public void confirmed() {
		if (loader.getFileName() == null || loader.getFileName().contentEquals("")) {
			view.showMessage("give a file name first");
			return;
		}
		if (loader.fileExists()) {
			String data = loader.loadData();
			view.displayData(data);

		} else {
			view.showMessage("file does not exist");
		}

	}

	public void cancelled() {

		view.close();
	}

}
