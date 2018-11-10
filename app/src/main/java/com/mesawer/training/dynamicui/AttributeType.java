package com.mesawer.training.dynamicui;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@StringDef({
        AttributeType.DATE,
        AttributeType.MEMO,
        AttributeType.VALUE_LIST,
        AttributeType.DB_LIST,
        AttributeType.TEXT,
        AttributeType.SYSTEM,
})
public @interface AttributeType {
    String DATE = "Date";
    String MEMO = "Memo";
    String VALUE_LIST = "Value List";
    String DB_LIST = "DB List";
    String TEXT = "Text";
    String SYSTEM = "System";
}
