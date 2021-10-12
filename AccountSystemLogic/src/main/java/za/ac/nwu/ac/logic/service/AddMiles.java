package za.ac.nwu.ac.logic.service;

import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.nwu.ac.domain.persistence.ACCOUNT;
import za.ac.nwu.ac.domain.persistence.MEMBER;
import za.ac.nwu.ac.repo.persistence.AccountRepository;


import java.util.List;

@Service
public class AddMiles implements AddService{

    //@Autowired
    private AccountRepository repository;

    @Override
    public List<MEMBER> addMiles(Long member_id, Long miles) {
        var member = (List<MEMBER>) repository.addMiles(2L, 12L);

        return member;
    }
}