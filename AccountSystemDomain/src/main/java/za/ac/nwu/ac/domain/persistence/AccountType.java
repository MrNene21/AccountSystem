package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")

public class AccountType implements Serializable{

    private static final long serialVersionUID = 5217592106233605838L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "ACCOUNT_TYPE_ID")
    private Long accountTypeID;

    @Column(name = "MNEMONIC")
    private String mnemonic;

    @Column(name = "ACCOUNT_TYPE_NAME")
    private String accountTypeName;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;
}
