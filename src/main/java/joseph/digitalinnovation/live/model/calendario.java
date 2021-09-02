package joseph.digitalinnovation.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class calendario {
    @Id
    private Long id;
    @ManyToOne
    private tipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
