package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.entities.AppRoleEntity;
import sn.esmt.admin.dao.AppRoleRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;

    //Fonction qui insere dans la Base de Donee
    @PostMapping(path = "/save")//POST REQUEST
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    //Fonction qui retourne la liste des users
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }

    @PostMapping(path = "/login/")
    public AppRoleEntity login(@RequestParam String email,@RequestParam String password){
        return appRoleRepository.findByEmailAndPassword(email, password);
    }


}
