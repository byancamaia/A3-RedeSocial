package br.anhembi.testea3.config;

import br.anhembi.testea3.domain.Post;
import br.anhembi.testea3.domain.User;
import br.anhembi.testea3.dto.AuthorDTO;
import br.anhembi.testea3.dto.CommentDTO;
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

        User maria = new User(null, "Maria Julia", "maju@gmail.com", "maria");
        User gabriel = new User(null, "Gabriel Fernando", "isagab@gmail.com", "gabriel");
        User carlos = new User(null, "Carlos Henrique", "caique@gmail.com", "carlos");

        userRepository.saveAll(Arrays.asList(maria, gabriel, carlos));

        Post post1 = new Post(null, sdf.parse("21/03/2022"), "Partiu Viagem!", "Vou viajar para SP. Abraços!",new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("01/06/2022"), "Bom dia!", "Acordei Feliz Hoje!", new AuthorDTO(carlos));
        Post post3 = new Post(null, sdf.parse("07/06/2022"), "Boa Tarde!", "Tenho que ir trabalhar!", new AuthorDTO(gabriel));

        CommentDTO c1 = new CommentDTO("Boa Viagem!", sdf.parse("21/03/2022"), new AuthorDTO(gabriel));
        CommentDTO c2 = new CommentDTO("Aproveita!", sdf.parse("22/03/2022"), new AuthorDTO(carlos));
        CommentDTO c3 = new CommentDTO("Tenha um ótimo dia!", sdf.parse("01/06/2022"), new AuthorDTO(gabriel));

        post1.getComments().addAll(Arrays.asList(c1,c2));
        post2.getComments().addAll(Arrays.asList(c3));

        postRepository.saveAll(Arrays.asList(post1, post2, post3));

        maria.getPosts().addAll(Arrays.asList(post1));
        carlos.getPosts().addAll(Arrays.asList(post2));
        gabriel.getPosts().addAll(Arrays.asList(post3));
        userRepository.save(maria);
        userRepository.save(carlos);
        userRepository.save(gabriel);
    }
}
