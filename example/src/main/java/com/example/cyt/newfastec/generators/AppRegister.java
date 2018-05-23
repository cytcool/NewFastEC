package com.example.cyt.newfastec.generators;


import com.example.latte.annotations.AppRegisterGenerator;
import com.example.latte.wechat.templates.AppRegisterTemplate;

@AppRegisterGenerator(
        packageName = "com.example.cyt.newfastec",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
