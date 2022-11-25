package Day09.Ex06_EventListener;

public class Button {

	OnClickListener listener;

	void setOnClickLisrener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	// 클릭 이베트 발생 시, 수행 기능을 정의한 인터페이스
	interface OnClickListener {

		void onClick();
	}
}
