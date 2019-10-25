package com.wn.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wn.entity.Product;
import com.wn.mapper.ProductMapper;
import com.wn.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductMapper productMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return productMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Product record) {
        return productMapper.insert(record);
    }

    @Override
    public int insertSelective(Product record) {
        return productMapper.insertSelective(record);
    }

    @Override
    public Product selectByPrimaryKey(Integer pid) {
        return productMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return productMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }

}
