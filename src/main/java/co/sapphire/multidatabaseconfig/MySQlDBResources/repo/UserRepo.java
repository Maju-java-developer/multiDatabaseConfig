package co.sapphire.multidatabaseconfig.MySQlDBResources.repo;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.UserEntity;
import co.sapphire.multidatabaseconfig.MySQlDBResources.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    List<UserProjection> findBy();
}
