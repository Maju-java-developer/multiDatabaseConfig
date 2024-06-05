package co.sapphire.multidatabaseconfig.MySQlDBResources.repo;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
