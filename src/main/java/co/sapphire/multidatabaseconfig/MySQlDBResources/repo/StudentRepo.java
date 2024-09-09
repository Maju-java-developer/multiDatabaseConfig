package co.sapphire.multidatabaseconfig.MySQlDBResources.repo;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.Student;
import co.sapphire.multidatabaseconfig.MySQlDBResources.projection.StudentNameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<StudentNameProjection> findBy();

    @Query("SELECT s.studentName as STUDENTNAME, s.contact as CONTACT FROM Student s")
    List<Map<String, Object>> getAllStudentDetails();
}
