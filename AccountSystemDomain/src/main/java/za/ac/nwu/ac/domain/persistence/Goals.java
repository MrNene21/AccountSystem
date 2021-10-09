package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "GOALS", schema = "LUYANDA")

public class GOALS implements Serializable{

    private static final long serialVersionUID = 1243865544560901669L;

    private Long goalID;
    private String goalHealthAndFitness;
    private String goalDriving;
    private long goalSpendingBehavior;
    private MEMBER member;

    public GOALS(Long goalID, String goalHealthAndFitness, String goalDriving, long goalSpendingBehavior, MEMBER member) {
        this.goalID = goalID;
        this.goalHealthAndFitness = goalHealthAndFitness;
        this.goalDriving = goalDriving;
        this.goalSpendingBehavior = goalSpendingBehavior;
        this.member = member;
    }

    public GOALS() {
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "GOAL_ID")
    public Long getGoalID() {
        return goalID;
    }

    public void setGoalID(Long goalID) {
        this.goalID = goalID;
    }

    @Column(name = "GOAL_HEALTH_AND_FITNESS")
    public String getGoalHealthAndFitness() {
        return goalHealthAndFitness;
    }

    public void setGoalHealthAndFitness(String goalHealthAndFitness) {
        this.goalHealthAndFitness = goalHealthAndFitness;
    }

    @Column(name = "GOAL_DRIVING")
    public String getGoalDriving() {
        return goalDriving;
    }

    public void setGoalDriving(String goalDriving) {
        this.goalDriving = goalDriving;
    }

    @Column(name = "GOAL_SPENDING_BEHAVIOR")
    public long getGoalSpendingBehavior() {
        return goalSpendingBehavior;
    }

    public void setGoalSpendingBehavior(long goalSpendingBehavior) {
        this.goalSpendingBehavior = goalSpendingBehavior;
    }

    @ManyToOne(fetch = FetchType.LAZY)
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
        GOALS goals = (GOALS) o;
        return goalSpendingBehavior == goals.goalSpendingBehavior && Objects.equals(goalID, goals.goalID) && Objects.equals(goalHealthAndFitness, goals.goalHealthAndFitness) && Objects.equals(goalDriving, goals.goalDriving) && Objects.equals(member, goals.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalID, goalHealthAndFitness, goalDriving, goalSpendingBehavior, member);
    }

    @Override
    public String toString() {
        return "GOALS{" +
                "goalID=" + goalID +
                ", goalHealthAndFitness='" + goalHealthAndFitness + '\'' +
                ", goalDriving='" + goalDriving + '\'' +
                ", goalSpendingBehavior=" + goalSpendingBehavior +
                ", member=" + member +
                '}';
    }
}

