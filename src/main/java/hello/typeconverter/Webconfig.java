package hello.typeconverter;

import hello.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.converter.StringToipPortConverter;
import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {


    @Override
    public void addFormatters(FormatterRegistry registry) {
        //주석처리 우선순위
        /*
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());*/
        registry.addConverter(new StringToipPortConverter());
        registry.addConverter(new IpPortToStringConverter());


        //추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
