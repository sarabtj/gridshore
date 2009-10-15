/*
 * Copyright (c) 2009. Gridshore
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.gridshore.enquiry.persistence;

import nl.gridshore.enquiry.input.EnquiryInstance;
import nl.gridshore.enquiry.input.EnquiryInstanceRepository;
import nl.gridshore.rdm.persistence.SimpleJpaDao;
import org.springframework.stereotype.Repository;

@Repository
public class EnquiryInstanceJpaDao extends SimpleJpaDao<EnquiryInstance> implements EnquiryInstanceRepository {

    public EnquiryInstanceJpaDao() {
        super(EnquiryInstance.class);
    }
}