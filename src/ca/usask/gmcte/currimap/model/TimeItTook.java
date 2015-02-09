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



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;


@SuppressWarnings("serial")
@Entity
@Table(name = "time_it_took")
public class TimeItTook implements java.io.Serializable
{

	private int id;
	private String name;
	private int calculationValue;
	private int displayIndex;
	
	public TimeItTook()
	{
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

	
	@Column(name = "name", nullable = false, length = 100)
	@NotNull
	@Length(max = 100)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	
	@Column(name = "display_index", nullable = false)
	public int getDisplayIndex()
	{
		return this.displayIndex;
	}

	public void setDisplayIndex(int displayIndex)
	{
		this.displayIndex = displayIndex;
	}

	@Column(name = "calculation_value", nullable = false)
	public int getCalculationValue() 
	{
		return calculationValue;
	}


	public void setCalculationValue(int calculationValue) 
	{
		this.calculationValue = calculationValue;
	}

}
