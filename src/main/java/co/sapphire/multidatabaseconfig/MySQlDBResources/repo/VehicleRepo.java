package co.sapphire.multidatabaseconfig.MySQlDBResources.repo;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends JpaRepository<VehicleEntity, Integer> {
}
