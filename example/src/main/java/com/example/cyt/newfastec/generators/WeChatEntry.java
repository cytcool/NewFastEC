package com.example.cyt.newfastec.generators;

import com.example.latte.annotations.EntryGenerator;
import com.example.latte.wechat.templates.WXEntryTemplate;

@EntryGenerator(
        packageName = "com.example.cyt.newfastec",
        entryTemplete = WXEntryTemplate.class
)
public interface WeChatEntry {
}
