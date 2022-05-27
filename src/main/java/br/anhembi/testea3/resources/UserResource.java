package br.anhembi.testea3.resources;

import br.anhembi.testea3.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    //@GetMapping
    public ResponseEntity<List<User>> findAll(){
        User m = new User("1", "bybs", "byan@maia.com", "jsaijsiod");
        User a = new User("2", "bAFDbs", "dfdsan@maia.com", "jsaijsiod");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(m, a));
        return ResponseEntity.ok().body(list);

        }
}
