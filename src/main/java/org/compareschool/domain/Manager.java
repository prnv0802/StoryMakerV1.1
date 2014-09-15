/**
 * 
 */
package org.compareschool.domain;

import java.util.List;

/**
 * @author DELL
 * To be deleted.
 * We don't need this separate class. Renaming the Teacher Class to Person Class. 
 */
public class Manager implements Person{
	private long id;
	private String firstName;
	private String lastName;
	private String designation;
	private String desc;
	private Institution institution;
	private List<PersonProperty> properties;

}
