import org.apache.poi.ss.usermodel.*
import java.io.FileOutputStream


fun main(args: Array<String>) {



//
//
//    val excelFilePath = "D:/FileDownloads/file.xlsx"
//
//    val workbook = WorkbookFactory.create(true)
//    val sheet = workbook.createSheet("Sheet1")
//
//    // createCells(listOf("My Table"), workbook, sheet, 0, 1)
//    createCells(listOf("", "", "My ", "Table", "", ""), workbook, sheet, 2, 1)
//    createCells(listOf("one0", "two0", "three0", "fore0", "five0", "six"), workbook, sheet, 3, 1)
//    createCells(listOf("one1", "two1", "three1", "fore1", "five1", "six"), workbook, sheet, 4, 1)
//    createCells(listOf("one2", "two2", "three2", "fore2", "five2", "six"), workbook, sheet, 5, 1)
//    createCells(listOf("one3", "two3", "three3", "fore3", "five3", "six"), workbook, sheet, 6, 1)
//    createCells(listOf("one4", "two4", "three4", "fore4", "five4", "six"), workbook, sheet, 7, 1)
//    createCells(listOf("", "", "My ", "Table", "2", ""), workbook, sheet, 8, 1)
//    createCells(listOf("one0", "two0", "three0", "fore0", "five0", "six"), workbook, sheet, 9, 1)
//    createCells(listOf("one1", "two1", "three1", "fore1", "five1", "six"), workbook, sheet, 10, 1)
//    createCells(listOf("one2", "two2", "three2", "fore2", "five2", "six"), workbook, sheet, 11, 1)
//    createCells(listOf("one3", "two3", "three3", "fore3", "five3", "six"), workbook, sheet, 12, 1)
//    createCells(listOf("one4", "two4", "three4", "fore4", "five4", "six"), workbook, sheet, 13, 1)
//    createCells(listOf("", "", "", "", "", ""), workbook, sheet, 14, 1)
//
//
//    val fileOutputStream = FileOutputStream(excelFilePath)
//    workbook.write(fileOutputStream)
//    workbook.close()
//    fileOutputStream.close()
//}
//
//
//fun createCells(textList: List<String>, workbook: Workbook, sheet: Sheet, numberRow: Int = 0, moveCell: Int = 0) {
//    val row = sheet.createRow(numberRow)
//    var cell: Cell
//    val createOneCell = !(textList[0].isBlank() && textList[5].isBlank())
//    for ((index, text) in textList.withIndex()) {
//        cell = row.createCell(index + moveCell)
//        cell.setCellValue(text)
//
//
//
//        creteStyleCell(workbook, cell, index, createOneCell)
//
//        sheet.setColumnWidth(index + moveCell, 15 * 256)
//        row.heightInPoints = 25f
//
//
//    }
//}
//
//
//fun creteStyleCell(workbook: Workbook, cell: Cell, index: Int, eachBorder: Boolean) {
//    val cellStyle = workbook.createCellStyle()
//    if (index % 2 == 0 && eachBorder) {
//        cellStyle.fillForegroundColor = IndexedColors.AQUA.index//GREEN.index
//        cellStyle.fillPattern = FillPatternType.SOLID_FOREGROUND
//    }
//    if (eachBorder) {
//        cellStyle.setBorderLeft(BorderStyle.THICK)
//        cellStyle.setBorderRight(BorderStyle.THICK)
//    } else {
//        if (index == 0)
//            cellStyle.setBorderLeft(BorderStyle.THICK)
//        if (index == 5)
//            cellStyle.setBorderRight(BorderStyle.THICK)
//
//        cellStyle.setBorderTop(BorderStyle.THICK)
//        cellStyle.setBorderBottom(BorderStyle.THICK)
//
//        cellStyle.fillForegroundColor = IndexedColors.AQUA.index
//        cellStyle.fillPattern = FillPatternType.SOLID_FOREGROUND
//    }
//
//    cellStyle.alignment = HorizontalAlignment.CENTER
//    cellStyle.verticalAlignment = VerticalAlignment.CENTER
//    cell.cellStyle = cellStyle
}

