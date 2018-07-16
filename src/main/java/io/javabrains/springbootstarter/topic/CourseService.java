package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository CourseRepository;
	
	public List<Course> getAllCourses() {
//		return topics;
		List<Course> topics = new ArrayList<>();
		CourseRepository.findAll()
			.forEach(topics::add);
		CourseRepository.findAll();
		return topics;
	}
	
	public Optional<Course> getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return CourseRepository.findById(id);
	}

	public void addCourse(Course topic) {
//		topics.add(topic);
		CourseRepository.save(topic);
	}

	public void updateCourse(Course topic, String id) {
//		for(int i=0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		CourseRepository.save(topic);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		CourseRepository.deleteById(id);
	}
}
