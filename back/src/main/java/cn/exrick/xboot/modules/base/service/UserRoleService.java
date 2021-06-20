package cn.exrick.xboot.modules.base.service;


import cn.exrick.xboot.base.XbootBaseService;
import cn.exrick.xboot.modules.base.entity.User;
import cn.exrick.xboot.modules.base.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户角色接口
 * @author 郑为中
 */
public interface UserRoleService extends XbootBaseService<UserRole,String> {

    /**
     * 通过roleId查找
     * @param roleId
     * @return
     */
    List<UserRole> findByRoleId(String roleId);

    /**
     * 通过roleId查找用户
     * @param roleId
     * @return
     */
    List<User> findUserByRoleId(String roleId);

    /**
     * 删除用户角色
     * @param userId
     */
    void deleteByUserId(String userId);

    List<UserRole> findUserRoleByUserId(String userId);
}
