/*
 * Copyright (c) 2008 JTeam B.V.
 * www.jteam.nl
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * JTeam B.V. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with JTeam.
 */
package nl.gridshore.enquiry.persistance;

import nl.gridshore.enquiry.def.EnquiryDef;
import nl.gridshore.enquiry.repository.EnquiryDefRepository;
import nl.gridshore.rdm.persistence.AbstractJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnquiryDefJpaDao extends AbstractJpaRepository<EnquiryDef> implements EnquiryDefRepository {

    public EnquiryDefJpaDao() {
        super(EnquiryDef.class);
    }
}