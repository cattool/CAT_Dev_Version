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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

/**
 * LinkCourseProgram generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "link_course_program")
public class LinkCourseProgram implements java.io.Serializable
{

	private int id;
	private Program program;
	private Course course;
	private CourseClassification courseClassification;
	private Time time;

	public LinkCourseProgram()
	{
	}

	public LinkCourseProgram(int id, Program program, Course course,
			CourseClassification courseClassification)
	{
		this.id = id;
		this.program = program;
		this.course = course;
		this.courseClassification = courseClassification;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "program_id", nullable = false)
	@NotNull
	public Program getProgram()
	{
		return this.program;
	}

	public void setProgram(Program program)
	{
		this.program = program;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id", nullable = false)
	@NotNull
	public Course getCourse()
	{
		return this.course;
	}

	public void setCourse(Course course)
	{
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_classification_id", nullable = false)
	@NotNull
	public CourseClassification getCourseClassification()
	{
		return this.courseClassification;
	}

	public void setCourseClassification(
			CourseClassification courseClassification)
	{
		this.courseClassification = courseClassification;
	}
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "time_id")
	public Time getTime()
	{
		return this.time;
	}

	public void setTime(Time time)
	{
		this.time = time;
	}
	
}
