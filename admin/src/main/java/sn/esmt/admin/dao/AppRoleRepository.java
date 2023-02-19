package sn.esmt.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.admin.entities.AppRoleEntity;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRoleEntity,Integer> {
    AppRoleEntity findById(int id);
    AppRoleEntity findByEmailAndPassword(String email, String password);

}
