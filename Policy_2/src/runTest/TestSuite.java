package runTest;

import dataSource.Constant;
import executeEngine.getExcelValues;

public class TestSuite {
	
	public static void main(String[] args) throws Exception {
		
		Constant.getConstant();
		getExcelValues.valuesToArray();
		getExcelValues.TCtoRunnig();
	}
}
