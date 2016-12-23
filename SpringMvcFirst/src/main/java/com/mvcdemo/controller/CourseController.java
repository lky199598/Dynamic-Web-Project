package com.mvcdemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



import com.mvcdemo.model.Course;
import com.mvcdemo.service.CourseService;

/*
 *��SpringMVC�У�������Controller ��������DispatcherServlet �ַ������� 
 *�����û���������ݾ���ҵ����㴦��֮���װ��һ��Model��Ȼ���ٰѸ�Model ���ظ���Ӧ��View ����չʾ
*/

//����DispatcherServlet��ص������� ����һ��Controller�� ��������beanŶ

@Controller

//�༶���RequestMapping������DispatcherServlet������ฺ�����Ը�URL��
//HandlerMapping���������ǩ������

@RequestMapping("/courses")

///courses/**
public class CourseController {
	private static Logger log = LoggerFactory.getLogger(CourseController.class);
	private CourseService courseService;
    
/*	@Autowired ע�ͣ������Զ����Ա���������������캯�����б�ע������Զ�װ��Ĺ����� 
	ͨ�� @Autowired��ʹ�������� set��get������
*/
	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//������������ /courses/view?courseId=?
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId") Integer courseId, Model model)
	{
		log.debug("In viewCourse, courseId = {}", courseId);
		Course course = courseService.getCoursebyId(courseId);
		model.addAttribute(course);
		return "course_overview";
	}
	
	//������������ /courses/view2/{courseId}
		@RequestMapping(value="/view2/{courseId}", method=RequestMethod.GET)
		public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String,Object> model)
		{
			log.debug("In viewCourse, courseId = {}", courseId);
			Course course = courseService.getCoursebyId(courseId);
			model.put("course",course);
			return "course_overview";
		}
		
		//������������ /courses/view3?courseId=678
		@RequestMapping(value="/view3")
		public String viewCourse3(HttpServletRequest request)
		{
			       Integer courseId = Integer.valueOf(request.getParameter("courseId"));
					log.debug("In viewCourse, courseId = {}", courseId);
					Course course = courseService.getCoursebyId(courseId);
					request.setAttribute("course", course);
					return "course_overview";
		}
		
		@RequestMapping(value="/admin",method = RequestMethod.GET, params = "add")
		public String createCourse(){
			return "course_admin/edit";
		}
		
		@RequestMapping(value="/save", method = RequestMethod.POST)
		public String doSave(Course course){
			log.debug("Info of Course:");
			log.debug(ReflectionToStringBuilder.toString(course));
			
			//�ڴ˽���ҵ��������������ݿ�־û�
			course.setCourseId(123);
			return "redirect:view2/"+course.getCourseId();
		}
		
		@RequestMapping(value="/upload", method=RequestMethod.GET)
		public String showUploadPage(){	
			return "course_admin/file";		
		}
		
		@RequestMapping(value="/doUpload", method=RequestMethod.POST)
		public String doUploadFile(@RequestParam("file") MultipartFile file){	
			if(!file.isEmpty())
			{
				log.debug("Process file: {}", file.getOriginalFilename());
				try {
					FileUtils.copyInputStreamToFile(file.getInputStream(), new File("F:\\Dynamic web project\\file\\", System.currentTimeMillis()+file.getOriginalFilename()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return "success";
		}
		
    /*@RequestBody
		���ã� 

	 i) ��ע�����ڶ�ȡRequest�����body�������ݣ�ʹ��ϵͳĬ�����õ�HttpMessageConverter���н�����
	       Ȼ�����Ӧ�����ݰ󶨵�Ҫ���صĶ����ϣ�
     ii)�ٰ�HttpMessageConverter���صĶ������ݰ󶨵� controller�з����Ĳ����ϡ�
     
     @ResponseBody
���ã� 
      ��ע�����ڽ�Controller�ķ������صĶ���
      ͨ���ʵ���HttpMessageConverterת��Ϊָ����ʽ��д�뵽Response�����body��������
     */
		
		
	   @RequestMapping(value="/{courseId}", method=RequestMethod.GET)	
	    public @ResponseBody Course getCourseInJson(@PathVariable Integer courseId)
	   {
		   return courseService.getCoursebyId(courseId);
	   }
	   
	   
		@RequestMapping(value="/jsontype/{courseId}",method=RequestMethod.GET)
		public ResponseEntity<Course> getCourseInJson2(@PathVariable Integer courseId){
			Course course = courseService.getCoursebyId(courseId);		
			return new ResponseEntity<Course>(course, HttpStatus.OK);
		}
}






