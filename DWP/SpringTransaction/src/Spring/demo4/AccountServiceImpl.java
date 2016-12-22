package Spring.demo4;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/*
 * 转账案例的业务层实现类
 */

/*
*@Transactional中的的属性
*propagation	:事务的传播行为
*isolation		:事务的隔离级别
*readOnly		:只读
*rollbackFor	:发生哪些异常回滚
*noRollbackFor	:发生哪些异常不回滚
*rollbackForClassName 根据异常类名回滚
*/
@Transactional
public class AccountServiceImpl implements AccountService {
	
	//注入转账的DAO
	private AccountDao accountDao;

	/**
	 * @param out	:转出账号
	 * @param in	:转入账号
	 * @param money	:转账金额
	 */
	@Override
	public void transfer(String out,String in,Double money) {
			
				accountDao.outMoney(out, money);
				//int i = 1/0;
				accountDao.inMoney(in, money);
		
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
/*
 * Java内部类引用外部类中的�?部变量为何必须是final
是生命周期的原因，因为方法内定义的变量是�?部变量，离开该方法，变量就失去了作用，也就会自动被消除，而内部类却不会离�?它所在方法就失去作用，它有更广的生命周期   
   若定义为final，则java编译器则会在内部类TimerPrint内生成一个外部变量的拷贝，�?�且可以既可以保证内部类可以引用外部属�?�，又能保证值的唯一性�??
 */


