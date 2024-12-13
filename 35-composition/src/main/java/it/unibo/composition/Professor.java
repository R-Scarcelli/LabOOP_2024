package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {
    private static final String DOT = ".";
    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, final String password,
            final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getCourses() {
        return Arrays.copyOf(courses, courses.length);
    }

    @Override
    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Professor [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password
                + ", courses=" + Arrays.toString(courses) + "]";
    }

    public void replaceCourse(final String course, final int index) {
        if (index <= this.courses.length) {
            this.courses[index] = course;
        }

    }

    public void replaceAllCourses(final String[] newCourses) {
        this.courses = Arrays.copyOf(newCourses, newCourses.length);

    }
}