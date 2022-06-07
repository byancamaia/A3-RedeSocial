package br.anhembi.testea3.services;

import br.anhembi.testea3.domain.User;
import br.anhembi.testea3.dto.UserDTO;
import br.anhembi.testea3.repository.UserRepository;
import br.anhembi.testea3.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User findByEmail(String email) {
        User obj = repo.findByEmail(email);
        return obj;
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
        newObj.setSenha(obj.getSenha());
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail(), objDto.getSenha());
    }


}
