package com.leewaiho.togogo.module.sys.service.product;

import com.leewaiho.togogo.common.base.service.BaseService;
import com.leewaiho.togogo.module.sys.model.product.TBProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Author leewaiho
 * Email 791783391@qq.com
 * Date 2017/9/20
 * Project togogo-shixun
 */
public interface ProductService extends BaseService<TBProduct> {
    
    Page<TBProduct> findProductsByTag(String tagId, Pageable pageable);
    
}
