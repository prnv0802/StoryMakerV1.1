package org.compareschool.domain;

public class PersonProperty implements Property{

	private long personPropertyId;
	private MasterProperty associatedMasterProperty;
	private PersonProperty associatedpersonProperty;
	private long associatedValue;
	
	public long getPersonPropertyId() {
		return personPropertyId;
	}
	public void setPersonPropertyId(long personPropertyId) {
		this.personPropertyId = personPropertyId;
	}
	public MasterProperty getAssociatedMasterProperty() {
		return associatedMasterProperty;
	}
	public void setAssociatedMasterProperty(MasterProperty associatedMasterProperty) {
		this.associatedMasterProperty = associatedMasterProperty;
	}
	public PersonProperty getAssociatedpersonProperty() {
		return associatedpersonProperty;
	}
	public void setAssociatedpersonProperty(PersonProperty associatedpersonProperty) {
		this.associatedpersonProperty = associatedpersonProperty;
	}
	public long getAssociatedValue() {
		return associatedValue;
	}
	public void setAssociatedValue(long associatedValue) {
		this.associatedValue = associatedValue;
	}

	

}
