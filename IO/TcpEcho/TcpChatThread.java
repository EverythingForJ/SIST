import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TcpChatThread extends Thread{
	private String userId;
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private Font font;
	
	public TcpChatThread(String userId) {
		this.userId = userId;
		this.font = new Font("맑은 고딕", Font.BOLD + Font.ITALIC, 30);
		this.f = new Frame("["+ this.userId + "] MyChatting v1");
		this.ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_BOTH);
		this.ta.setFont(font);
		this.ta.setEditable(false); // 수정 불가하게 만듬
		this.tf = new TextField();
		this.tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // event handler
				String line = TcpChatThread.this.tf.getText();
				TcpChatThread.this.ta.append(line+"\n");
				TcpChatThread.this.tf.setText("");
			}
		});
		this.tf.setFont(font);
		this.f.add(ta, "Center");
		this.f.add(tf,"South");
		this.service();
		this.f.setSize(500, 800);
		this.f.setVisible(true);
	}
	
	private void service() {
		
	}
	
	@Override
	public void run() {
		// 수신처리
		
	}
	
	public static void main(String[] args) {
		
	}
}
