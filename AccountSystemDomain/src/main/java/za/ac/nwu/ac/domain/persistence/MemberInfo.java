package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "MEMBER_INFO", schema = "VITRSA_SANDBOX")

public class MemberInfo implements Serializable{

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
    private LocalDate memberJoiningDate;

    public MemberInfo(Long memberID, String memberFirstNAme, String memberFirstName, long memberMiles, LocalDate memberJoiningDate) {
        this.memberID = memberID;
        this.memberFirstNAme = memberFirstNAme;
        this.memberFirstName = memberFirstName;
        this.memberMiles = memberMiles;
        this.memberJoiningDate = memberJoiningDate;
    }

    public MemberInfo() {
    }

    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    public String getMemberFirstNAme() {
        return memberFirstNAme;
    }

    public void setMemberFirstNAme(String memberFirstNAme) {
        this.memberFirstNAme = memberFirstNAme;
    }

    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public long getMemberMiles() {
        return memberMiles;
    }

    public void setMemberMiles(long memberMiles) {
        this.memberMiles = memberMiles;
    }

    public LocalDate getMemberJoiningDate() {
        return memberJoiningDate;
    }

    public void setMemberJoiningDate(LocalDate memberJoiningDate) {
        this.memberJoiningDate = memberJoiningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberInfo that = (MemberInfo) o;
        return memberMiles == that.memberMiles && Objects.equals(memberID, that.memberID) && Objects.equals(memberFirstNAme, that.memberFirstNAme) && Objects.equals(memberFirstName, that.memberFirstName) && Objects.equals(memberJoiningDate, that.memberJoiningDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, memberFirstNAme, memberFirstName, memberMiles, memberJoiningDate);
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "memberID=" + memberID +
                ", memberFirstNAme='" + memberFirstNAme + '\'' +
                ", memberFirstName='" + memberFirstName + '\'' +
                ", memberMiles=" + memberMiles +
                ", memberJoiningDate=" + memberJoiningDate +
                '}';
    }
}
