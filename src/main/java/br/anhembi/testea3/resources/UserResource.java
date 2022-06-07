package br.anhembi.testea3.resources;

import br.anhembi.testea3.domain.Post;
import br.anhembi.testea3.domain.User;

import br.anhembi.testea3.domain.User2;
import br.anhembi.testea3.dto.UserDTO;
import br.anhembi.testea3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable("id")String id ){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(new UserDTO(obj));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody UserDTO objDto){
        User obj = service.fromDTO(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    public ResponseEntity<User> insert2(@RequestBody User2 objDto){
        User user2 = service.findByEmail(objDto.getEmail());

        return ResponseEntity.ok() .body(user2);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable("id")String id ){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable("id")String id ){
        User obj = service.fromDTO(objDto);
        obj.setId(id);
        obj = service.update(obj);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/posts", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findPosts(@PathVariable("id")String id ){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj.getPosts());
    }

}
