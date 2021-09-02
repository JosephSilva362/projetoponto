package joseph.digitalinnovation.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;
}
