select student.student_name,((sysdate - student.enrolled_date)/7 ) as "Enrolled Weeks" from student join course on student.course = course.course_id;