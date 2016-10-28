package com.cs.tu.analysis.core;

import java.util.List;

import com.cs.tu.analysis.model.VarDetail;
import com.cs.tu.analysis.model.VarPath;

public class Formula {
	
	
	
	public void replaceTempWithQuery(VarDetail varDetail){
		
		List<VarPath>  varPathList = varDetail.getPathList();
		if(varPathList != null){
			for (VarPath varPath : varPathList) {
//				varPath.getNodePathList()
			}
		}
	}
	
	private static boolean replaceTempWithQueryRule1(int size, int du, int cu, int pu){
		
		boolean isTrue = false;
		if(size > 0){
			isTrue = du == 1 && (cu > 0 || pu > 0);
		}
		return isTrue;
	}
	
	public static void main(String args[]){
		boolean isTrue = replaceTempWithQueryRule1(0, 1	, 1, 0);
		System.out.println(isTrue);
	}

}
