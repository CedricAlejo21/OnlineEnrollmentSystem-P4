package com.enrollment.enrollment.client;

import com.enrollment.enrollment.model.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "course-service")
public interface CourseClient {
    @GetMapping("/api/courses/{id}")
    Course getCourse(@PathVariable Long id);

    @PostMapping("/api/courses/{id}/enroll")
    Course incrementEnrollment(@PathVariable Long id);

    @PostMapping("/api/courses/{id}/unenroll")
    Course decrementEnrollment(@PathVariable Long id);
} 