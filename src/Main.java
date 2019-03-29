
import Dao.SugarDao;
import entity.Sugar;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import sugarsystem.SugarSystemGUI;

/**
 * 测试Hibernate
 *
 * @author liaozl
 *
 */
public class Main {

    public static void main(String[] args) {
        //增加食物
//		SugarDao sugarDao = new SugarDao();
//		Sugar sugar = new Sugar();
//		sugar.setCommodityName("东坡肉");
//		sugarDao.addObject(sugar);
        //通过主键ID删除食物
        //foodDao.delObjectById(2);
//		sugarDao.delObjectById(1);
//		System.out.println(sugarDao.queryUniqueObject("1").getCommodityName());
//		food=foodDao.queryUniqueObject("1");
        /*System.out.println(food.getName());*/

//		  return;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
           Date date = (Date) sdf.parse("2008-07-10");
           System.out.println(date);
        } catch (ParseException ex) {
          Logger.getLogger(SugarSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
