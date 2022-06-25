
package cliente.ws.servicio;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioImplService", targetNamespace = "http://ws.jax.org.mx/", wsdlLocation = "http://localhost:8080/ServicioImplService/ServicioImpl?wsdl")
public class ServicioImplService
    extends Service
{

    private final static URL SERVICIOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOIMPLSERVICE_EXCEPTION;
    private final static QName SERVICIOIMPLSERVICE_QNAME = new QName("http://ws.jax.org.mx/", "ServicioImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioImplService/ServicioImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOIMPLSERVICE_WSDL_LOCATION = url;
        SERVICIOIMPLSERVICE_EXCEPTION = e;
    }

    public ServicioImplService() {
        super(__getWsdlLocation(), SERVICIOIMPLSERVICE_QNAME);
    }

    public ServicioImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOIMPLSERVICE_QNAME, features);
    }

    public ServicioImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOIMPLSERVICE_QNAME);
    }

    public ServicioImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOIMPLSERVICE_QNAME, features);
    }

    public ServicioImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServicio
     */
    @WebEndpoint(name = "ServicioImplPort")
    public IServicio getServicioImplPort() {
        return super.getPort(new QName("http://ws.jax.org.mx/", "ServicioImplPort"), IServicio.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServicio
     */
    @WebEndpoint(name = "ServicioImplPort")
    public IServicio getServicioImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.jax.org.mx/", "ServicioImplPort"), IServicio.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICIOIMPLSERVICE_EXCEPTION;
        }
        return SERVICIOIMPLSERVICE_WSDL_LOCATION;
    }

}