package com.tyss.hibernate.xml.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingInfoBean {
	private int courseId;
	private String CourseName;
	private String duration;
	private String courseType;
}
