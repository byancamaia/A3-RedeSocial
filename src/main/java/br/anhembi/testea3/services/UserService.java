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

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail(), objDto.getSenha());
    }
}
