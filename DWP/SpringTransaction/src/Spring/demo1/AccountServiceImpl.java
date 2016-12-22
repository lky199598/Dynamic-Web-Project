package Spring.demo1;



import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;


public class AccountServiceImpl implements AccountService {
	
	//注入转账的DAO
	private AccountDao accountDao;
	
	
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;

	/**
	 * @param out	:转出账号
	 * @param in	:转入账号
	 * @param money	:转账金额
	 */
	@Override
	public void transfer(final String out, final String in, final Double money) {
			
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				int i = 1/0;
				accountDao.inMoney(in, money);
			}
		});
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}
/*
 * Java内部类引用外部类中的局部变量为何必须是final
是生命周期的原因，因为方法内定义的变量是局部变量，离开该方法，变量就失去了作用，也就会自动被消除，而内部类却不会离开它所在方法就失去作用，它有更广的生命周期   
   若定义为final，则java编译器则会在内部类TimerPrint内生成一个外部变量的拷贝，而且可以既可以保证内部类可以引用外部属性，又能保证值的唯一性。
 */


