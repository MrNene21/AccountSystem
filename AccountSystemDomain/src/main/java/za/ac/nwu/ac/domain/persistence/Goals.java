package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Goals", schema = "VITRSA_SANDBOX")

public class Goals implements Serializable{

    private static final long serialVersionUID = 290792419935667969L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "GOAL_ID")
    private Long goalID;

    @Column(name = "GOAL_HEALTH_AND_FITNESS")
    private String goalHealthAndFitness;

    @Column(name = "GOAL_DRIVING")
        private String goalDriving;

    @Column(name = "GOAL_SPENDING_BEHAVIOR")
    private long goalSpendingBehavior;


}
