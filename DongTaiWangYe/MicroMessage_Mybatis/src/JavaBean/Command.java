package JavaBean;

import java.util.List;

/*
 * ��ָ����Ӧ��ʵ����
 */
public class Command {
	private int command_id;//����
	private String name;//����
	private String description;//����
	private List<Content> content_list;//һ��ָ���Ӧ���Զ��ظ������б�
	
	
	public Command() {
	}

	public int getCommand_id() {
		return command_id;
	}

	public void setCommand_id(int command_id) {
		this.command_id = command_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Content> getContent_list() {
		return content_list;
	}

	public void setContent_list(List<Content> content_list) {
		this.content_list = content_list;
	}

}
