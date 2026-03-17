package selenium.training.assignment.ten;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {

	public static Object[][] getExcelData(String filePath, String sheetName) {
		Object[][] data = null;
		System.out.println("FilePath: " + filePath);
		try (FileInputStream fis = new FileInputStream(new File(filePath));
				// Specific XSSF class for .xlsx
				XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

			XSSFSheet sheet = workbook.getSheet(sheetName);
			// Returns index of last row
			int rowCount = sheet.getLastRowNum();
			// Returns total columns
			int colCount = sheet.getRow(0).getLastCellNum();

			// Initialize 2D Object array
			data = new Object[rowCount][colCount];

			for (int i = 0; i < rowCount; i++) {
				// Skip header row
				XSSFRow row = sheet.getRow(i + 1);
				for (int j = 0; j < colCount; j++) {
					XSSFCell cell = row.getCell(j);
					data[i][j] = getCellValue(cell);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	private static Object getCellValue(XSSFCell cell) {
		if (cell == null)
			return "";

		// Use getCellType() to determine data format
		return switch (cell.getCellType()) {
		case STRING -> cell.getStringCellValue();
		case NUMERIC -> DateUtil.isCellDateFormatted(cell) ? cell.getDateCellValue() : cell.getNumericCellValue();
		case BOOLEAN -> cell.getBooleanCellValue();
		case FORMULA -> cell.getCellFormula();
		case BLANK -> "";
		default -> "";
		};
	}

}
