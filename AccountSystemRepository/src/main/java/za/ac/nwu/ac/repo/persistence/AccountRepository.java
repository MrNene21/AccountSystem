package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.ACCOUNT;

@Repository
public interface AccountRepository extends JpaRepository<ACCOUNT, Long> {
    Object addMiles(long l, long l1);
}
