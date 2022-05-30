package br.anhembi.testea3.config;

import br.anhembi.testea3.domain.User;
import br.anhembi.testea3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "maria eoinw", "amria@fjisj.com", "sajsi");
        User alex = new User(null, "alex", "alex@fjisj.com", "ksapks");
        User bob = new User(null, "bobw", "bob@fjisj.com", "assji");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
