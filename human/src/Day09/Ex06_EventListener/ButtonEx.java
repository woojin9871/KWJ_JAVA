package Day09.Ex06_EventListener;

public class ButtonEx {

	public static void main(String[] args) {

		Button btn = new Button();

		btn.setOnClickLisrener(new CallListener());
		btn.touch();

		btn.setOnClickLisrener(new MessageListener());
		btn.touch();
	}
}
