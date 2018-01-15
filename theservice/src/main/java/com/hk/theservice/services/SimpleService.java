package com.hk.theservice.services;

import com.hk.theservice.dao.SimpleDto;
import com.hk.theservice.dao.SimpleQry;

/**
 * Created by kunhe on 1/15/18.
 */
public interface SimpleService {
    SimpleDto simple();

    SimpleDto simpleWithOneParam(String transparentString);

    SimpleDto simpleWithQry(SimpleQry qry);
}
