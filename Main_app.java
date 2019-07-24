
public class Main_app {

	public static void main(String[] args) {
		FileLoad loader = new FileLoad();
		FileSelFrame frame = new FileSelFrame();
		FileSelPresent presenter = new FileSelPresent(frame);
		presenter.setLoader(loader);
		presenter.start();
	}

}
