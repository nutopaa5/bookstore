package hh.swd20.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hh.swd20.bookstore.web.BookController;
import hh.swd20.bookstore.web.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookstoreApplicationTests {

    @Autowired
    private BookController controller1;
    
    @Autowired
    private UserController controller2;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller1).isNotNull();
        assertThat(controller2).isNotNull();
    }	
    
}
