package cn.exrick.xboot.modules.your.serviceimpl;

import cn.exrick.xboot.modules.your.mapper.DormitoryMapper;
import cn.exrick.xboot.modules.your.entity.Dormitory;
import cn.exrick.xboot.modules.your.service.IDormitoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 宿舍管理接口实现
 * @author 郑为中
 */
@Slf4j
@Service
@Transactional
public class IDormitoryServiceImpl extends ServiceImpl<DormitoryMapper, Dormitory> implements IDormitoryService {

    @Autowired
    private DormitoryMapper dormitoryMapper;
}