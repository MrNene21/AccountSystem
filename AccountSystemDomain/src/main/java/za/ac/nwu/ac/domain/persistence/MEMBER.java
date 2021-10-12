package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

//@Entity
@Table(name = "MEMBER", schema = "LUYANDA")

public class MEMBER implements Serializable{

    private static final long serialVersionUID = 5217592106233605838L;

    private Long memberID;
    private String memberFirstName;
    private String memberLastName;

    private Set<GOALS> goals;
    private Set<ACCOUNT> accounts;
    private Set<TRANSACTION> transactions;

    public MEMBER(Long memberID, String memberFirstName, String memberLastName) {
        this.memberID = memberID;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
    }

    public MEMBER() {
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "MEMBER_ID")
    public Long getMemberID() {
        return memberID;
    }
    @OneToMany(targetEntity = MEMBER.class, fetch = FetchType.LAZY, mappedBy = "member", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<TRANSACTION> getTransactions() {
        return transactions;
    }

    @OneToOne(targetEntity = MEMBER.class, fetch = FetchType.LAZY, mappedBy = "member", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<ACCOUNT> getAccounts() {
        return accounts;
    }

    @OneToMany(targetEntity = GOALS.class, fetch = FetchType.LAZY, mappedBy = "member", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<GOALS> getGoals() {
        return goals;
    }

    public void setGoals(Set<GOALS> goals) {
        this.goals = goals;
    }

    public void setAccounts(Set<ACCOUNT> accounts) {
        this.accounts = accounts;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    @Column(name = "MEMBER_FIRST_NAME")
    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    @Column(name = "MEMBER_LAST_NAME")
    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MEMBER member = (MEMBER) o;
        return Objects.equals(memberID, member.memberID) && Objects.equals(memberFirstName, member.memberFirstName) && Objects.equals(memberLastName, member.memberLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, memberFirstName, memberLastName);
    }

    @Override
    public String toString() {
        return "MEMBER{" +
                "memberID=" + memberID +
                ", memberFirstName='" + memberFirstName + '\'' +
                ", memberLastName='" + memberLastName + '\'' +
                '}';
    }
}
