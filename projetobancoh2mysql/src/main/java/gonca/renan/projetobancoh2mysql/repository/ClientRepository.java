package gonca.renan.projetobancoh2mysql.repository;

import gonca.renan.projetobancoh2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}