package com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *��SpringMVC�У�������Controller ��������DispatcherServlet �ַ������� 
 *�����û���������ݾ���ҵ����㴦��֮���װ��һ��Model ��Ȼ���ٰѸ�Model ���ظ���Ӧ��View ����չʾ
*/

//����DispatcherServlet��ص������� ����һ��Controller�� ��������beanŶ
@Controller
//�༶���RequestMapping������DispatcherServlet������ฺ�����Ը�URL��
//HandlerMapping���������ǩ������
@RequestMapping("/hello")
public class HelloMvcController {
	
	//���������RequestMapping�� ���Ʋ���С��URL·��ƥ�䣬ͬ�༶��ı�ǩЭͬ����������ȷ�����ص���URL���Ǹ���������
	@RequestMapping("/mvc")
	public String helloMvc() {
		
		//��ͼ��Ⱦ��/WEB-INF/jsps/home.jsp
		return "home";
	}
}
