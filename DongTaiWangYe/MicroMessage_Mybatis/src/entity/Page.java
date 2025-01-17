/*
 * 不与数据库关联的类，放在entity包下
 */
package entity;
/*
 * 分页对应的实体类
 */
public class Page {
	
private final static int pageNumber=5;//每页显示条数	
	
private int totalMessageNumber;//记录总条数

private int currentPage;//当前第几页

private int totalPageNumber;//总页数

private int indexMessageNumber;//开始查询的条数

/*
 * 计算总页数
 */
public void countTotalPageNumber()
{
	if(totalMessageNumber % pageNumber == 0)
		totalPageNumber=totalMessageNumber/ pageNumber;
	else
		totalPageNumber=totalMessageNumber / pageNumber+1;
	if(totalPageNumber < 1)
		totalPageNumber=1;	
	
	if(currentPage > totalPageNumber)
		currentPage = totalPageNumber;
	/*
	 * 计算开始查询的条数
	 */
	indexMessageNumber = (currentPage-1)*pageNumber;
}




public int getTotalMessageNumber() {
	return totalMessageNumber;
}

public void setTotalMessageNumber(int totalMessageNumber) {
	this.totalMessageNumber = totalMessageNumber;
	countTotalPageNumber();
}


public int getCurrentPage() {
	return currentPage;
}

public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}

public int getTotalPageNumber() {
	return totalPageNumber;
}

public void setTotalPageNumber(int totalPageNumber) {
	this.totalPageNumber = totalPageNumber;
}

public int getIndexMessageNumber() {
	return indexMessageNumber;
}

public void setIndexMessageNumber(int indexMessageNumber) {
	this.indexMessageNumber = indexMessageNumber;
}

public static int getPagenumber() {
	return pageNumber;
}

}
