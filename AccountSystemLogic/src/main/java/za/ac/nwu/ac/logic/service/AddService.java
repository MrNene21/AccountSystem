package za.ac.nwu.ac.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.MEMBER;
import za.ac.nwu.ac.domain.persistence.MEMBER;

import java.util.List;

//@EntityScan("za.ac.nwu.ac.domain")
//@EnableJpaRepositories("za.ac.nwu.ac.repo")
//@ComponentScan({"za.ac.nwu.ac.repo"})
public interface AddService {
    List<MEMBER> addMiles(Long member_id, Long miles);
}