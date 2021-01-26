package wang.dreamland.www.service;

import wang.dreamland.www.entity.UserInfo;

/**
 * 用户信息业务
 */
public interface UserInfoService {
    /**
     * 根据用户id查询用户详细信息
     * @param id
     * @return
     */
    UserInfo findByUid(Long id);

    /**
     * 更新用户信息
     * @param userInfo
     */
    void update(UserInfo userInfo);

    /**
     * 添加用户信息
     * @param userInfo
     */
    void add(UserInfo userInfo);

}
