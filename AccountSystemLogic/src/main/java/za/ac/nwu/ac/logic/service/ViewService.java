package za.ac.nwu.ac.logic.service;

import za.ac.nwu.ac.domain.persistence.MEMBER;

public interface ViewService {
    MEMBER viewMiles(MEMBER member, Long memberId);
}