/**
 * 
 */
package com.cs.tu.analysis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author true
 *
 */
public class VarDetail {

	
	private String varName;
	private int du;
	private int cu;
	private int pu;
	private int pathNo;
	private List<VarPath> pathList = new ArrayList<VarPath>();
	
	
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public int getDu() {
		return du;
	}
	public void setDu(int du) {
		this.du = du;
	}
	public int getCu() {
		return cu;
	}
	public void setCu(int cu) {
		this.cu = cu;
	}
	public int getPu() {
		return pu;
	}
	public void setPu(int pu) {
		this.pu = pu;
	}
	public int getPathNo() {
		return pathNo;
	}
	public void setPathNo(int pathNo) {
		this.pathNo = pathNo;
	}
	public List<VarPath> getPathList() {
		return pathList;
	}
	public void setPathList(List<VarPath> pathList) {
		this.pathList = pathList;
	}
	
	
	
	
	
}
