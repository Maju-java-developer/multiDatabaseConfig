package co.sapphire.multidatabaseconfig.MySQlDBResources.controller;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.Student;
import co.sapphire.multidatabaseconfig.MySQlDBResources.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Student")
@AllArgsConstructor
public class StudentController {

    private final StudentRepo studentRepo;

    @PostMapping("getAll")
    public List<?> getAll() {
        return studentRepo.findBy();
    }
    @PostMapping("getAllStudent")
    public List<?> getAllStudent() {
        return studentRepo.getAllStudentDetails();
    }

    @PostMapping("addStudent")
    public Student addStudent(@RequestBody Student addStudent) {
        return studentRepo.save(addStudent);
    }

    @PostMapping("/delete")
    public String deleteStudent(@RequestBody Student delete) {
        studentRepo.deleteById(delete.getId());
        return "DELETE Successfully!";
    }

}

