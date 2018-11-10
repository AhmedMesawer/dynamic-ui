package com.mesawer.training.dynamicui;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Util {

    //region response
    private static final String response = "[\n" +
            "    {\n" +
            "        \"panelGroup\": \"Access Info.\",\n" +
            "        \"panelSeq\": 2,\n" +
            "        \"panelRecid\": 85,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"TC\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Memo\",\n" +
            "        \"attributeTypeRecid\": 18,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 50\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Main Info.\",\n" +
            "        \"panelSeq\": 1,\n" +
            "        \"panelRecid\": 1,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Requisition Number\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Memo\",\n" +
            "        \"attributeTypeRecid\": 18,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 3,\n" +
            "        \"memoColumn\": 15\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Planned Installation Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 3,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Planned Configuration Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 4,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Main Info.\",\n" +
            "        \"panelSeq\": 1,\n" +
            "        \"panelRecid\": 1,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Contractor\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": true,\n" +
            "        \"attributeType\": \"DB List\",\n" +
            "        \"attributeTypeRecid\": 4,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": [\n" +
            "            \"Access\",\n" +
            "            \"Barik\",\n" +
            "            \"Elite\",\n" +
            "            \"HTC\",\n" +
            "            \"Redline\",\n" +
            "            \"SIAE\",\n" +
            "            \"WeNet\",\n" +
            "            \"ZTE\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Main Info.\",\n" +
            "        \"panelSeq\": 1,\n" +
            "        \"panelRecid\": 1,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Upgrade Type\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Value List\",\n" +
            "        \"attributeTypeRecid\": 3,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": [\n" +
            "            \"SW\",\n" +
            "            \"HW\",\n" +
            "            \"VLAN Additional\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Main Info.\",\n" +
            "        \"panelSeq\": 1,\n" +
            "        \"panelRecid\": 1,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"BOQ Required?\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": true,\n" +
            "        \"attributeType\": \"Value List\",\n" +
            "        \"attributeTypeRecid\": 3,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": [\n" +
            "            \"Yes\",\n" +
            "            \"No\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Access Info.\",\n" +
            "        \"panelSeq\": 2,\n" +
            "        \"panelRecid\": 85,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Upgrade Details\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Memo\",\n" +
            "        \"attributeTypeRecid\": 18,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 3,\n" +
            "        \"memoColumn\": 50\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Planned Survey Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"BOQ Submit Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Main Info.\",\n" +
            "        \"panelSeq\": 1,\n" +
            "        \"panelRecid\": 1,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Serial #\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": false,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Text\",\n" +
            "        \"attributeTypeRecid\": 1,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Actual Survey Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Actual Installation Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 3,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Actual Configuration Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 4,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Survey Delay\",\n" +
            "        \"attributeValue\": \" Day(s)\",\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"System\",\n" +
            "        \"attributeTypeRecid\": 11,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": [\n" +
            "            \" Day(s)\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Configuration Delay\",\n" +
            "        \"attributeValue\": \" Day(s)\",\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"System\",\n" +
            "        \"attributeTypeRecid\": 11,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 4,\n" +
            "        \"valueList\": [\n" +
            "            \" Day(s)\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Installation Delay\",\n" +
            "        \"attributeValue\": \" Day(s)\",\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"System\",\n" +
            "        \"attributeTypeRecid\": 11,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 3,\n" +
            "        \"valueList\": [\n" +
            "            \" Day(s)\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"BOQ Delay\",\n" +
            "        \"attributeValue\": \" Day(s)\",\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"System\",\n" +
            "        \"attributeTypeRecid\": 11,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": [\n" +
            "            \" Day(s)\"\n" +
            "        ],\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Implementation Info.\",\n" +
            "        \"panelSeq\": 3,\n" +
            "        \"panelRecid\": 110,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"BOQ Request Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 7\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"OCR Submitted\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"OCR Approval\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"SAAC Submitted\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 4,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"SAAC Approval\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"SOCC Submitted\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 2,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"SOCC Approval\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 3,\n" +
            "        \"rowNo\": 2,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    },\n" +
            "    {\n" +
            "        \"panelGroup\": \"Acceptance Info.\",\n" +
            "        \"panelSeq\": 4,\n" +
            "        \"panelRecid\": 314,\n" +
            "        \"attributeRecid\": null,\n" +
            "        \"attributeName\": \"Acceptance Date\",\n" +
            "        \"attributeValue\": null,\n" +
            "        \"attributeValueRecid\": null,\n" +
            "        \"readOnly\": true,\n" +
            "        \"mandatory\": false,\n" +
            "        \"attributeType\": \"Date\",\n" +
            "        \"attributeTypeRecid\": 5,\n" +
            "        \"colNo\": 1,\n" +
            "        \"rowNo\": 1,\n" +
            "        \"valueList\": null,\n" +
            "        \"format\": null,\n" +
            "        \"momoRow\": 2,\n" +
            "        \"memoColumn\": 18\n" +
            "    }\n" +
            "]";
    //endregion

    public static List<Attribute> attributes() {
        Gson gson = new Gson();
        return Arrays.asList(gson.fromJson(response, Attribute[].class));
    }
}
