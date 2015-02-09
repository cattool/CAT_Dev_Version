/*****************************************************************************
 * Copyright 2012, 2013 University of Saskatchewan
 *
 * This file is part of the Curriculum Alignment Tool (CAT).
 *
 * CAT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 *(at your option) any later version.
 *
 * CAT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with CAT.  If not, see <http://www.gnu.org/licenses/>.
 *
 ****************************************************************************/


package ca.usask.gmcte.currimap.model;

// Generated Dec 3, 2011 11:40:19 AM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

/**
 * LinkCourseOfferingOutcome generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "link_organization_organization_outcome")
public class LinkOrganizationOrganizationOutcome implements java.io.Serializable
{

	private int id;
	private Organization organization;
	private OrganizationOutcome organizationOutcome;
	
	public LinkOrganizationOrganizationOutcome()
	{
	}

	public LinkOrganizationOrganizationOutcome(int id, Organization p,
			CourseClassification courseClassification, OrganizationOutcome organizationOutcome)
	{
		this.id = id;
		this.organization = p;
		this.organizationOutcome = organizationOutcome;
	}

	@Id @GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization_id", nullable = false)
	@NotNull
	public Organization getOrganization()
	{
		return this.organization;
	}

	public void setOrganization(Organization p)
	{
		this.organization = p;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "organization_outcome_id", nullable = false)
	@NotNull
	public OrganizationOutcome getOrganizationOutcome()
	{
		return this.organizationOutcome;
	}

	public void setOrganizationOutcome(OrganizationOutcome outcome)
	{
		this.organizationOutcome = outcome;
	}
}
