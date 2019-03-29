package Dao;

import java.util.List;

public interface IBaseDao<T> {
	/**	 
	 * @param object
	 * @return 
	 */
	public String addObject(T object);
	public void delObject(T object);
	public void delObjectById(int id);
	public String updateObject(T object);
	public T queryUniqueObject(String id);
	public List<T>queryObjectListBySql(String strSql);
	public List<T>queryObjectListByHql(String strHql);
	public int getAllCountByHql(String strHql);
	/**
	 * 分页查询方法
	 * @param strHql
	 * @param iStart
	 * @param iNum
	 * @return
	 */
	public List<T>queryListForPage(String strHql,int iStart,int iNum);
}
