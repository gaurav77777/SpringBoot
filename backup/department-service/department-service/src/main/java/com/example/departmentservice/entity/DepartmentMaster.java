package com.example.departmentservice.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class DepartmentMaster {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
    private Integer id;
	
	@Column
    private String departmentName;
	
	@Column
	private String departmentAddress;
	
	@Column
	private String departmentCode;

	@Override
	public String toString() {
		return "DepartmentMaster [id=" + id + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	

	
	
	

	
	
	

}
