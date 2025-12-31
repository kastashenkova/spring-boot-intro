package mate.academy.intro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
@
public class Book {
    @Id
    @GeneratedValue()
    public Long id;
}
