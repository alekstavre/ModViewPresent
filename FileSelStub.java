
public class FileSelStub implements FileSelView {

	private boolean opened;
	private String name;
	private int numOfMsg;
	private boolean dataDisplayed;
	private FileSelPresent presenter;

	public FileSelStub() {
		this.opened = false;
		this.presenter = null;
		this.name = "";
		this.numOfMsg = 0;
		this.dataDisplayed = false;

	}

	@Override
	public void open() {
		this.opened = true;

	}

	@Override
	public void close() {
		this.opened = false;
	}

	@Override
	public boolean isOpened() {
		return this.opened;
	}

	@Override
	public void setPresenter(FileSelPresent presenter) {
		this.presenter = presenter;
	}

	@Override
	public FileSelPresent getPresenter() {
		return this.presenter;
	}

	@Override
	public void setFileName(String name) {
		this.name = name;

	}

	@Override
	public String getFIleName() {

		return this.name;
	}

	@Override
	public void showMessage(String msg) {
		this.numOfMsg++;

	}

	@Override
	public void displayData(String data) {
		this.dataDisplayed = true;

	}
	
	public int getMsgSent() {
		return this.numOfMsg;
	}

	public boolean dataDisplayed() {
		return this.dataDisplayed;
	}
}
