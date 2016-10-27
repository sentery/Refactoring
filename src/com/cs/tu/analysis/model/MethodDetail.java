package com.cs.tu.analysis.model;

import java.util.List;

public class MethodDetail {

	private String methodName;
	private List<VarDetail>  varDetails;
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public List<VarDetail> getVarDetails() {
		return varDetails;
	}
	public void setVarDetails(List<VarDetail> varDetails) {
		this.varDetails = varDetails;
	}
	
	
}
