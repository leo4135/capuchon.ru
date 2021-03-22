package uchetka.demo.repository;

import org.springframework.data.repository.CrudRepository;
import uchetka.demo.entity.ClothesAll;

public interface ClothesAllRepository extends CrudRepository<ClothesAll, Integer> {
}
