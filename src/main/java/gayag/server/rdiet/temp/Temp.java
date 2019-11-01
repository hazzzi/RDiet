package gayag.server.rdiet.temp;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Temp {
    @Id
    @GeneratedValue
    private Long tempId;

    private String subject;

    private String contents;
}
