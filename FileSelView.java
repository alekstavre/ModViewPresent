import java.io.Serializable;

public interface FileSelView extends Serializable{

	public void open();

	public void close();

	public boolean isOpened();

	public void setPresenter(FileSelPresent presenter);

	public FileSelPresent getPresenter();

	public void setFileName(String name);

	public String getFIleName();

	public void showMessage(String msg);

	public void displayData(String data);

}
