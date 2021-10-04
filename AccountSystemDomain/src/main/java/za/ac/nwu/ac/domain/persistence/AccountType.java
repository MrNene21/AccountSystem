package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "MEMBER_INFO", schema = "VITRSA_SANDBOX")

public class AccountType implements Serializable{

    private static final long serialVersionUID = 5217592106233605838L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "MEMBER_ID")
    private Long memberID;

    @Column(name = "MEMBER_FIRST_NAME")
    private String memberFirstNAme;

    @Column(name = "MEMBER_LAST_NAME")
    private String memberFirstName;

    @Column(name = "MEMBER_MILES")
    private long memberMiles;

    @Column(name = "MEMBER_JOINING_DATE")
    private LocalDate memberLastName;
}
