package com.kysoft.bookstore.dao;

import com.kysoft.bookstore.domain.Account;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-21
 * Time: 下午5:59
 * To change this template use File | Settings | File Templates.
 */
public interface AccountDao {

    /**
     * 根据 accountId 获取对应的 Account 对象
     * @param accountId
     * @return
     */
    public abstract Account get(Integer accountId);

    /**
     * 根据传入的 accountId, amount 更新指定账户的余额: 扣除 amount 指定的钱数
     * @param accountId
     * @param amount
     */
    public abstract void updateBalance(Integer accountId, float amount);

}
