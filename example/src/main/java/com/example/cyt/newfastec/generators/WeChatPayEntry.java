package com.example.cyt.newfastec.generators;

import com.example.latte.annotations.PayEntryGenerator;
import com.example.latte.wechat.templates.WXPayEntryTemplate;

@PayEntryGenerator(
        packageName = "com.example.cyt.newfastec",
        payEntryTemplete = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
