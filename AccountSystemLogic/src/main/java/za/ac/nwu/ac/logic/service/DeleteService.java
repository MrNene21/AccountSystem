package za.ac.nwu.ac.logic.service;

import za.ac.nwu.ac.domain.persistence.MEMBER;

public interface DeleteService {
    MEMBER deleteMiles(MEMBER member, Long miles);
}