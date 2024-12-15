package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;
import org.example.hexlet.dto.courses.CoursesPage;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        //app.get("/courses", ctx -> {
        app.get("/courses/{id}", ctx -> {
            var courses = new ArrayList<Course>();/* Список курсов извлекается из базы данных */
            courses.add(new Course(1L,"OLOLOLO","kekeke"));
            courses.add(new Course(1L,"TROLOLOLO","kekeke"));
            //
            //var header = "Курсы по программированию";
            //var page = new CoursesPage(courses, header);
            //ctx.render("courses/show.jte", model("page", page));
            //app.get("/courses/{id}", ctx -> {
                var id = ctx.pathParam("id");
                var course = courses.get(1);/* Курс извлекается из базы данных. Как работать с базами данных мы разберем в следующих уроках */
                var page = new CoursePage(course);
                ctx.render("courses/show.jte", model("page", page));

        });

        app.start(7070);
    }
}
