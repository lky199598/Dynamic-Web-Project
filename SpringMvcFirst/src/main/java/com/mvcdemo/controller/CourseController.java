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
 *在SpringMVC中，控制器Controller 负责处理由DispatcherServlet 分发的请求 
 *它把用户请求的数据经过业务处理层处理之后封装成一个Model，然后再把该Model 返回给对应的View 进行展示
*/

//告诉DispatcherServlet相关的容器， 这是一个Controller， 管理好这个bean哦

@Controller

//类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理以跟URL。
//HandlerMapping依靠这个标签来工作

@RequestMapping("/courses")

///courses/**
public class CourseController {
	private static Logger log = LoggerFactory.getLogger(CourseController.class);
	private CourseService courseService;
    
/*	@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 
	通过 @Autowired的使用来消除 set，get方法。
*/
	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//本方法将处理 /courses/view?courseId=?
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId") Integer courseId, Model model)
	{
		log.debug("In viewCourse, courseId = {}", courseId);
		Course course = courseService.getCoursebyId(courseId);
		model.addAttribute(course);
		return "course_overview";
	}
	
	//本方法将处理 /courses/view2/{courseId}
		@RequestMapping(value="/view2/{courseId}", method=RequestMethod.GET)
		public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String,Object> model)
		{
			log.debug("In viewCourse, courseId = {}", courseId);
			Course course = courseService.getCoursebyId(courseId);
			model.put("course",course);
			return "course_overview";
		}
		
		//本方法将处理 /courses/view3?courseId=678
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
			
			//在此进行业务操作，比如数据库持久化
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
		作用： 

	 i) 该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，
	       然后把相应的数据绑定到要返回的对象上；
     ii)再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上。
     
     @ResponseBody
作用： 
      该注解用于将Controller的方法返回的对象，
      通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。
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






