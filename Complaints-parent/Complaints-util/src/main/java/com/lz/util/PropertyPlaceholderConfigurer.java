package com.lz.util;

import java.io.IOException;
import java.util.Properties;

public class PropertyPlaceholderConfigurer extends org.springframework.beans.factory.config.PropertyPlaceholderConfigurer
{
    
    private static Properties props;
    
    @Override
    public Properties mergeProperties() throws IOException
    {
        props=super.mergeProperties();
        
        return props;
    }
}
