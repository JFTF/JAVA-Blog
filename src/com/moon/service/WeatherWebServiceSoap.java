package com.moon.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-03-19T17:18:30.165+08:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "WeatherWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherWebServiceSoap {

    @WebMethod(action = "http://WebXml.com.cn/getSupportProvince")
    @RequestWrapper(localName = "getSupportProvince", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportProvince")
    @ResponseWrapper(localName = "getSupportProvinceResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportProvinceResponse")
    @WebResult(name = "getSupportProvinceResult", targetNamespace = "http://WebXml.com.cn/")
    public com.moon.service.ArrayOfString getSupportProvince();

    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityNamePro")
    @RequestWrapper(localName = "getWeatherbyCityNamePro", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetWeatherbyCityNamePro")
    @ResponseWrapper(localName = "getWeatherbyCityNameProResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetWeatherbyCityNameProResponse")
    @WebResult(name = "getWeatherbyCityNameProResult", targetNamespace = "http://WebXml.com.cn/")
    public com.moon.service.ArrayOfString getWeatherbyCityNamePro(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String theCityName,
        @WebParam(name = "theUserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String theUserID
    );

    @WebMethod(action = "http://WebXml.com.cn/getSupportCity")
    @RequestWrapper(localName = "getSupportCity", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportCity")
    @ResponseWrapper(localName = "getSupportCityResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportCityResponse")
    @WebResult(name = "getSupportCityResult", targetNamespace = "http://WebXml.com.cn/")
    public com.moon.service.ArrayOfString getSupportCity(
        @WebParam(name = "byProvinceName", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String byProvinceName
    );

    @WebMethod(action = "http://WebXml.com.cn/getSupportDataSet")
    @RequestWrapper(localName = "getSupportDataSet", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportDataSet")
    @ResponseWrapper(localName = "getSupportDataSetResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetSupportDataSetResponse")
    @WebResult(name = "getSupportDataSetResult", targetNamespace = "http://WebXml.com.cn/")
    public com.moon.service.GetSupportDataSetResponse.GetSupportDataSetResult getSupportDataSet();

    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityName")
    @RequestWrapper(localName = "getWeatherbyCityName", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetWeatherbyCityName")
    @ResponseWrapper(localName = "getWeatherbyCityNameResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.moon.service.GetWeatherbyCityNameResponse")
    @WebResult(name = "getWeatherbyCityNameResult", targetNamespace = "http://WebXml.com.cn/")
    public com.moon.service.ArrayOfString getWeatherbyCityName(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String theCityName
    );
}
