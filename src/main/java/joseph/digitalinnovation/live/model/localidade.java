package joseph.digitalinnovation.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class localidade {
    @Id
    private  long id;
    @ManyToOne
    private nivelAcesso nivelAcesso;
    private String descricao;
}
