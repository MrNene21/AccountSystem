package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT", schema = "LUYANDA")

public class ACCOUNT implements Serializable {

    private static final long serialVersionUID = 9111128237243028273L;

    private long accountID;
    private int accountMiles;
    private  LocalDate accountCreationDate;
    private MEMBER member;

    private Set<TRANSACTION> transactions;

    public ACCOUNT(long accountID, int accountMiles, LocalDate accountCreationDate, MEMBER member) {
        this.accountID = accountID;
        this.accountMiles = accountMiles;
        this.accountCreationDate = accountCreationDate;
        this.member = member;
    }

    public ACCOUNT() {
    }

    public ACCOUNT(int miles, LocalDate accountCreationDate) {
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "ACCOUNT_ID")
    public long getAccountID() {
        return accountID;
    }

    @OneToMany(targetEntity = TRANSACTION.class, fetch = FetchType.LAZY, mappedBy = "account", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<TRANSACTION> getTransactions() {
        return transactions;
    }


    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    @Column(name = "ACCOUNT_MILES")
    public long getAccountMiles() {
        return accountMiles;
    }

    public void setAccountMiles(int accountMiles) {
        this.accountMiles = accountMiles;
    }

    @Column(name = "ACCOUNT_CREATION_DATE")
    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    public MEMBER getMember() {
        return member;
    }

    public void setMember(MEMBER member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ACCOUNT account = (ACCOUNT) o;
        return accountID == account.accountID && accountMiles == account.accountMiles && Objects.equals(accountCreationDate, account.accountCreationDate) && Objects.equals(member, account.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, accountMiles, accountCreationDate, member);
    }

    @Override
    public String toString() {
        return "ACCOUNT{" +
                "accountID=" + accountID +
                ", accountMiles=" + accountMiles +
                ", accountCreationDate=" + accountCreationDate +
                ", member=" + member +
                '}';
    }
}
