package com.gupao.gp16306.pattern.template.course;

public class NetworkCourseTest {

    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("----大数据课程---");
        NetworkCourse bigDataCource = new BigDataCourse(true);
        bigDataCource.createCourse();
    }
}
