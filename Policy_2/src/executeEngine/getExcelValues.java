package executeEngine;
import java.util.Arrays;

import dataSource.Constant;

import utility.ExcelUtils;
public class getExcelValues {
	
	static String Path = Constant.PathFile;
	static String SheetName = Constant.SheetName;
	static int sortCol;
	static int sortRow;
	static String[][] sortTC;
	
	public static void valuesToArray() throws Exception{
		
		ExcelUtils.setExcelFile(Path, SheetName);
		String Name = ExcelUtils.ExcelWSheet.getSheetName();
		int NumberOfColumns = ExcelUtils.ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		sortCol = NumberOfColumns;
		int NumberOfRows = ExcelUtils.ExcelWSheet.getPhysicalNumberOfRows();
		sortRow = NumberOfRows;
		System.out.println("Sheetname - " + Name);
		System.out.println("NumberOfColumns -" + NumberOfColumns);
		System.out.println("NumberOfRows - " + NumberOfRows);
		String[][] TC = new String[NumberOfRows][NumberOfColumns];
		System.out.println("TC - " + TC.length+"\n");
		int RowNum = 0;
		int rowCounter =1;
		for(int getRow = 0; getRow < NumberOfRows -1; getRow++){
						
			for(int getCol = 0; getCol < NumberOfColumns ; getCol++){
				//Get columns name 
				TC[0][getCol] = ExcelUtils.getCellData(RowNum, getCol);					 
				// Get value of rows										
				TC[rowCounter][getCol] = ExcelUtils.getCellData(rowCounter, getCol);
				//System.out.println("Column:" +TC[0][getCol]+ " Value is: " + TC[rowCounter][getCol]);
				//if(getCol == NumberOfColumns-1)System.out.println("\t\t\t\t-----Nastêpny wiersz------" + getRow);									
			}
			rowCounter++;
		}
		sortTC = TC.clone();		
	}
	public static void TCtoRunnig() throws Exception{
		String[] TCforTest = new String[sortRow];
		int row = 1;
		
		String RUN;				
		for(int x = 0; x < sortRow -1; x++){
			int col = 1;
			
			RUN = sortTC[col][0];
			System.out.println("RUN is - " + RUN + "\n");			
			System.out.println("TC NAME -" + sortTC[col][3]);
			if(RUN.equalsIgnoreCase("Yes")){
				for(int y = 0; y < sortCol -1; y++){
				    
					System.out.println("Column: " + sortTC[0][col]+ "\nValue is: " + sortTC[row][col]);							
					TCforTest[y] = sortTC[row][col];					 					
									
					col++;
					if(y == sortCol) System.out.println("Nastêpny wiersz\n" );
				}
			
			} 
		    row++;
	   }
	}
}
