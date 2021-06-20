package cn.exrick.xboot.modules.crm.serviceimpl;

import cn.exrick.xboot.modules.crm.mapper.ShangChangPositionMapper;
import cn.exrick.xboot.modules.crm.entity.ShangChangPosition;
import cn.exrick.xboot.modules.crm.service.IShangChangPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 商场位置接口实现
 * @author 郑为中
 */
@Slf4j
@Service
@Transactional
public class IShangChangPositionServiceImpl extends ServiceImpl<ShangChangPositionMapper, ShangChangPosition> implements IShangChangPositionService {

    @Autowired
    private ShangChangPositionMapper shangChangPositionMapper;
}