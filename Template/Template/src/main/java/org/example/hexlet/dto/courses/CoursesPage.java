//package org.example.hexlet.dto.courses;
//
//public class CoursesPage {
//}

// Путь src/org/example/hexlet/dto/courses/CoursesPage.java
package org.example.hexlet.dto.courses;

import java.util.Collections;
import java.util.List;

import lombok.NoArgsConstructor;
import org.example.hexlet.model.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CoursesPage {
    private List<Course> courses = Collections.emptyList();
    private String header = "kekeke";
}
