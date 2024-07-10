package Entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "board")
public class BoaedEntity  extends com.woori.layoutboard.Entity.BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    @Column(name="subject", length = 100, nullable = false)
    private String subject;
    @Column(name="content", length = 200)
    private String content;
}
