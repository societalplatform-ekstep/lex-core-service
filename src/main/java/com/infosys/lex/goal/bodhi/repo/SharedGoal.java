/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
/**
© 2017 - 2019 Infosys Limited, Bangalore, India. All Rights Reserved. 
Version: 1.10

Except for any free or open source software components embedded in this Infosys proprietary software program (“Program”),
this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India,
the United States and other countries. Except as expressly permitted, any unauthorized reproduction, storage, transmission in any form or
by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), or any distribution of 
this Program, or any portion of it, may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible
under the law.

Highly Confidential
 
*/
package com.infosys.lex.goal.bodhi.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_shared_goals")
public class SharedGoal {
	@PrimaryKey
	SharedGoalKey userSharedGoalsPrimaryKey;
	@Column("goal_content_id")
	private List<String> goalContentId;
	@Column("goal_desc")
	private String goalDescription;
	@Column("goal_duration")
	private Integer goalDuration;
	@Column("goal_start_date")
	private Date goalStartDate;
	@Column("goal_end_date")
	private Date goalEndDate;
	@Column("goal_title")
	private String goalTitle;
	@Column("last_updated_on")
	private Date lastUpdatedOn;
	@Column("shared_on")
	private Date sharedOn;
	@Column("status")
	private Integer status;
	@Column("status_message")
	private String statusMessage;
	@Column("version")
	private Float version;
//	@Column("certifications")
//	private List<String> certifications;

//	public List<String> getCertifications() {
//		return certifications;
//	}
//
//	public void setCertifications(List<String> certifications) {
//		this.certifications = certifications;
//	}

	public SharedGoalKey getUserSharedGoalsPrimaryKey() {
		return userSharedGoalsPrimaryKey;
	}

	public List<String> getGoalContentId() {
		return goalContentId;
	}

	public String getGoalDescription() {
		return goalDescription;
	}

	public Integer getGoalDuration() {
		return goalDuration;
	}

	public Date getGoalStartDate() {
		return goalStartDate;
	}

	public Date getGoalEndDate() {
		return goalEndDate;
	}

	public String getGoalTitle() {
		return goalTitle;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public Date getSharedOn() {
		return sharedOn;
	}

	public Integer getStatus() {
		return status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setUserSharedGoalsPrimaryKey(SharedGoalKey userSharedGoalsPrimaryKey) {
		this.userSharedGoalsPrimaryKey = userSharedGoalsPrimaryKey;
	}

	public void setGoalContentId(List<String> goalContentId) {
		this.goalContentId = goalContentId;
	}

	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

	public void setGoalDuration(Integer goalDuration) {
		this.goalDuration = goalDuration;
	}

	public void setGoalStartDate(Date goalStartDate) {
		this.goalStartDate = goalStartDate;
	}

	public void setGoalEndDate(Date goalEndDate) {
		this.goalEndDate = goalEndDate;
	}

	public void setGoalTitle(String goalTitle) {
		this.goalTitle = goalTitle;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public void setSharedOn(Date sharedOn) {
		this.sharedOn = sharedOn;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Float getVersion() {
		return version;
	}

	public void setVersion(Float version) {
		this.version = version;
	}

	public SharedGoal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SharedGoal(SharedGoalKey userSharedGoalsPrimaryKey, List<String> goalContentId, String goalDescription,
			Integer goalDuration, Date goalStartDate, Date goalEndDate, String goalTitle, Date lastUpdatedOn,
			Date sharedOn, Integer status, String statusMessage, Float version) {
		super();
		this.userSharedGoalsPrimaryKey = userSharedGoalsPrimaryKey;
		this.goalContentId = goalContentId;
		this.goalDescription = goalDescription;
		this.goalDuration = goalDuration;
		this.goalStartDate = goalStartDate;
		this.goalEndDate = goalEndDate;
		this.goalTitle = goalTitle;
		this.lastUpdatedOn = lastUpdatedOn;
		this.sharedOn = sharedOn;
		this.status = status;
		this.statusMessage = statusMessage;
		this.version = version;
	}

	@Override
	public String toString() {
		return "SharedGoal [userSharedGoalsPrimaryKey=" + userSharedGoalsPrimaryKey + ", goalContentId=" + goalContentId
				+ ", goalDescription=" + goalDescription + ", goalDuration=" + goalDuration + ", goalStartDate="
				+ goalStartDate + ", goalEndDate=" + goalEndDate + ", goalTitle=" + goalTitle + ", lastUpdatedOn="
				+ lastUpdatedOn + ", sharedOn=" + sharedOn + ", status=" + status + ", statusMessage=" + statusMessage
				+ ", version=" + version + "]";
	}
}
