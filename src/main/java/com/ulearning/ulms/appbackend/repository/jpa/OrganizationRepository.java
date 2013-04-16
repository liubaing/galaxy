package com.ulearning.ulms.appbackend.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulearning.ulms.appbackend.entity.Organization;


/**
 * 类说明:机构DAO接口
 * @author heshuai
 * @version Feb 24, 2012
 *
 * Copyright (c) 2006-2011.Beijing WenHua Online Sci-Tech Development Co. Ltd
 * All rights reserved.
 */
public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

}