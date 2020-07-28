package com.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.demo.service.DogmaService;
import com.demo.utils.MyRT;
import com.demo.web.bundle.dogma.entity.Attribute;
import com.demo.web.bundle.dogma.model.service.AttributeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Data
@Service("dogmaService")
@Component
@ConfigurationProperties(prefix = "esi.dogma")
public class DogmaServiceImpl implements DogmaService
{
    @Autowired
    AttributeService attributeService;

    private String pre;

    private String pre163;

    private int threadNums;

    private HashMap<String, Object> params;

    private static String queryParams = "/?datasource={datasource}&language={language}&page={page}";

    private static String queryParams163 = "/?datasource={datasource163}&language={language}&page={page}";

    @Override
    public void updateAttributes()
    {
        String attributesDetailUrl = pre163 + "attributes/";
        String jsonStr;
        List<String> attributeIds = getAllAttributeIds();
        for (String id : attributeIds)
        {
            jsonStr = MyRT.getReq(attributesDetailUrl + id + queryParams163,
                    params);
            attributeService.save(JSON.parseObject(jsonStr, Attribute.class));
        }
    }

    @Override
    public List<String> getAllAttributeIds()
    {
        String attributesUrl = pre163 + "attributes/";
        return MyRT.restTemplate.getForObject(attributesUrl,
                List.class,
                params);
    }

}
