package co.sapphire.multidatabaseconfig.MySQlDBResources.controller;

import co.sapphire.multidatabaseconfig.MySQlDBResources.dto.UserDto;
import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.UserEntity;
import co.sapphire.multidatabaseconfig.MySQlDBResources.repo.UserRepo;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("User")
@AllArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @PostMapping("getAll")
    public List<?> getAll() {
        return userRepo.findBy();
    }

//    @PostMapping("addUser")
//    public UserEntity addUser(@RequestBody UserEntity userEntity) {
//        return userRepo.save(userEntity);
//    }

    @PostMapping("addUser")
    public UserEntity addUser(@Valid @RequestBody UserDto userDto) {
        System.out.println(userDto.toString());
        return null;
    }

}

