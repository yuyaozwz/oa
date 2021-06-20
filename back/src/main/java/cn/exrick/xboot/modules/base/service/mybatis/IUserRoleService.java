package cn.exrick.xboot.modules.base.service.mybatis;

import cn.exrick.xboot.modules.base.entity.Role;
import cn.exrick.xboot.modules.base.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 郑为中
 */
@CacheConfig(cacheNames = "userRole")
public interface IUserRoleService extends IService<UserRole> {

    /**
     * 通过用户id获取
     * @param userId
     * @return
     */
    @Cacheable(key = "#userId")
    List<Role> findByUserId(String userId);

    /**
     * 通过用户id获取用户角色关联的部门数据
     * @param userId
     * @return
     */
    List<String> findDepIdsByUserId(String userId);


    List<Role> findByUserIdZwz(String userId);
}
