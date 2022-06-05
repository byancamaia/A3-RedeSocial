package br.anhembi.testea3.config;

import br.anhembi.testea3.domain.Post;
import br.anhembi.testea3.domain.User;
import br.anhembi.testea3.dto.AuthorDTO;
import br.anhembi.testea3.repository.PostRepository;
import br.anhembi.testea3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "maria eoinw", "amria@fjisj.com", "sajsi");
        User alex = new User(null, "alex", "alex@fjisj.com", "ksapks");
        User bob = new User(null, "bobw", "bob@fjisj.com", "assji");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/05/2022"), "Partiu Viagem!", "Vou viajar para SP. Abraços!",new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("01/06/2022"), "Bom dia!", "Acordei Feliz Hoje!", new AuthorDTO(maria));

        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
