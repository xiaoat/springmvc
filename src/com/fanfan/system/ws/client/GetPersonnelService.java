
package com.fanfan.system.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetPersonnelService", targetNamespace = "com.fanfan.system.ws.service", wsdlLocation = "http://localhost:8080/fanfan/webservice/getPersonnel?wsdl")
public class GetPersonnelService
    extends Service
{

    private final static URL GETPERSONNELSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETPERSONNELSERVICE_EXCEPTION;
    private final static QName GETPERSONNELSERVICE_QNAME = new QName("com.fanfan.system.ws.service", "GetPersonnelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/fanfan/webservice/getPersonnel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETPERSONNELSERVICE_WSDL_LOCATION = url;
        GETPERSONNELSERVICE_EXCEPTION = e;
    }

    public GetPersonnelService() {
        super(__getWsdlLocation(), GETPERSONNELSERVICE_QNAME);
    }

    public GetPersonnelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETPERSONNELSERVICE_QNAME, features);
    }

    public GetPersonnelService(URL wsdlLocation) {
        super(wsdlLocation, GETPERSONNELSERVICE_QNAME);
    }

    public GetPersonnelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETPERSONNELSERVICE_QNAME, features);
    }

    public GetPersonnelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetPersonnelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetPersonnel
     */
    @WebEndpoint(name = "GetPersonnelPort")
    public GetPersonnel getGetPersonnelPort() {
        return super.getPort(new QName("com.fanfan.system.ws.service", "GetPersonnelPort"), GetPersonnel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetPersonnel
     */
    @WebEndpoint(name = "GetPersonnelPort")
    public GetPersonnel getGetPersonnelPort(WebServiceFeature... features) {
        return super.getPort(new QName("com.fanfan.system.ws.service", "GetPersonnelPort"), GetPersonnel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETPERSONNELSERVICE_EXCEPTION!= null) {
            throw GETPERSONNELSERVICE_EXCEPTION;
        }
        return GETPERSONNELSERVICE_WSDL_LOCATION;
    }

}
