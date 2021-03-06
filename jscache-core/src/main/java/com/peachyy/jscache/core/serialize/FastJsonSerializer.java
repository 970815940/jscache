package com.peachyy.jscache.core.serialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.peachyy.jscache.core.Serializer;

import java.io.IOException;

/**
 * @author Xs.Tao
 */
public class FastJsonSerializer implements Serializer {
    @Override
    public String name() {
        return "fastJson";
    }

    @Override
    public byte[] serialize(Object obj) throws IOException {
        return JSON.toJSONString(obj, SerializerFeature.WriteClassName).getBytes();
    }

    @Override
    public Object deserialize(byte[] bytes) throws IOException {
        return JSON.parse(new String(bytes), Feature.SupportAutoType);
    }
}
