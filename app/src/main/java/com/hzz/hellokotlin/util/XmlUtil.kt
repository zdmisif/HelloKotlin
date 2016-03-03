package com.hzz.hellokotlin.util

import javax.xml.parsers.SAXParserFactory

/**
 * Created by ewhale on 2016/3/3.
 */
class XmlUtil {
    fun parse(xml: String) {
        var factory = SAXParserFactory.newInstance();
        var parser = factory.newSAXParser();

    }
}