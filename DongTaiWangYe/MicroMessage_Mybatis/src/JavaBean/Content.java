package JavaBean;
/*
 * �����ݱ��Ӧ��ʵ����
 */
public class Content {
	private int content_id;//����
	private String content;//����
	private int command_id;//������Command������

	public Content() {
	}

	public int getContent_id() {
		return content_id;
	}

	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCommand_id() {
		return command_id;
	}

	public void setCommand_id(int command_id) {
		this.command_id = command_id;
	}

}
