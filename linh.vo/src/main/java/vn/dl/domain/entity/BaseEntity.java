package vn.dl.domain.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import vn.dl.domain.BaseDomain;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7471403279446904333L;
	
	protected abstract BaseDomain toDomain();

}
