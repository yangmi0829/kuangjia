package com.liugh.service.impl;

import com.liugh.entity.Cities;
import com.liugh.mapper.CitiesMapper;
import com.liugh.service.ICitiesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-11
 */
@Service
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, Cities> implements ICitiesService {

}
