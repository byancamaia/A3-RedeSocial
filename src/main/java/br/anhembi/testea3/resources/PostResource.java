package br.anhembi.testea3.resources;

import br.anhembi.testea3.domain.Post;
import br.anhembi.testea3.domain.User;
import br.anhembi.testea3.dto.UserDTO;
import br.anhembi.testea3.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findAll(){
        List<Post> list = service.findAll();
        return ResponseEntity.ok(list);
    }

}
