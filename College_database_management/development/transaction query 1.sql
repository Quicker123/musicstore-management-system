select student.student_name, student.course, course.fees, (course.fees * 0.1) as "Discount Amount" from student join course on course.course_id = student.course join specification on specification.course = course.course_id where lower(specification.specification_name) = 'computing';