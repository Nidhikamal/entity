package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "codes_setting")
public class CodesSetting {

	@Id
	@Column(name = "setting_id",nullable=false)
	private String settingId;
	
	@Column(name = "setting_name",nullable=false)
	private String settingName;
	
	@Column(name = "zoom_image",nullable=true)
	private String zoomImage;
	
	@Column(name = "thumb_image",nullable=true)
	private String thumbImage;

}
