package com.sk.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private Integer sno;
	private String sname,addrs;
	/**
	 * @return the sno
	 */
	public Integer getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the addrs
	 */
	public String getAddrs() {
		return addrs;
	}
	/**
	 * @param addrs the addrs to set
	 */
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

}
