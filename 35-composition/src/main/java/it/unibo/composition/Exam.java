package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private static int DEFAULT_REGISTERED_STUDENT = 0;
    int id;
    int maxStudents;
    int registeredStudents;
    String courseName;
    Professor professor;
    ExamRoom room;
    Student[] students;

    public Exam(final int id, final int maxStudents, final String courseName, final Professor professor,
            final ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = DEFAULT_REGISTERED_STUDENT;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(this.students, this.students.length);
    }

    public void registerStudent(Student student) {
        if (registeredStudents < maxStudents) {
            this.students[registeredStudents] = student;
            registeredStudents++;
        }
    }

    @Override
    public String toString() {
        return "Exam [id=" + id + ", maxStudents=" + maxStudents + ", registeredStudents=" + registeredStudents
                + ", courseName=" + courseName + ", professor=" + professor + ", room=" + room + ", students="
                + Arrays.toString(students) + "]";
    }

}
