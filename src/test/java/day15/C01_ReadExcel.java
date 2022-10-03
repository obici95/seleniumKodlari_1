package day15;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void readExcelTest01() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/resources/ulkeler.xlsx";

        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);

        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //-WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis);

        //Excel tablosundaki tum tabloyu konsola yazdirin.
        int sonSatir=workbook.getSheet("Sayfa1").getLastRowNum();
        String gecici="";

        for (int i = 0; i <=sonSatir ; i++) {
                gecici=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString()+", "
                        +workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()+", "
                        +workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString()+", "
                        +workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString()+", ";

            System.out.println(gecici);
        }

        // Kisa yol
      // for (int i = 0; i <sonData ; i++) {
      //     for (int j = 0; j <4 ; j++) {
      //         System.out.print(workbook.getSheet("Sayfa1").getRow(i).getCell(j)+", ");
      //     }
      //     System.out.println("");
      // }
    }
}