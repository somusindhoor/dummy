package com.jsp.dheeyantra.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Resource;
	private String FieldName;
	private Object FieldValue;
	
	public ResourceNotFoundException(String Resource, String FieldName, Object FieldValue) {
		super(Resource +"Not Found For: "+FieldName+" and Value: "+FieldValue);
		this.Resource = Resource;
		this.FieldName = FieldName;
		this.FieldValue = FieldValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getResource() {
		return Resource;
	}

	public String getFieldName() {
		return FieldName;
	}

	public Object getFieldValue() {
		return FieldValue;
	}
}
