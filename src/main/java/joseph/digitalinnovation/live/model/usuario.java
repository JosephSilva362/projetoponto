package joseph.digitalinnovation.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class usuario {
    @Id
    private Long id;
    @ManyToOne
    private categoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private empresa empresa;
    @ManyToOne
    private nivelAcesso nivelAcesso;
    @ManyToOne
    private  jornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}