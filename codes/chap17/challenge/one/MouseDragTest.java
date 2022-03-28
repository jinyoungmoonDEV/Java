package challenge.one;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseDragTest extends JFrame {
	public MouseDragTest() {
		setTitle("드래그로 사각형 그리기");

		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);

		JPanel p2 = new JPanel();
		JLabel status = new JLabel("마우스 위치 정보");
		p2.add(status);

		add("Center", p1);
		add("South", p2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseDragTest();
	}
}