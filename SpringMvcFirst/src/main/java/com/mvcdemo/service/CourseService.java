package com.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.mvcdemo.model.Course;

public interface CourseService {
	Course getCoursebyId(Integer courseId);
}
