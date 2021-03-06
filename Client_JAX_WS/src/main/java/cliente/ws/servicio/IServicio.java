
package cliente.ws.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServicio", targetNamespace = "http://ws.jax.org.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServicio {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setDocumento", targetNamespace = "http://ws.jax.org.mx/", className = "cliente.ws.servicio.SetDocumento")
    @ResponseWrapper(localName = "setDocumentoResponse", targetNamespace = "http://ws.jax.org.mx/", className = "cliente.ws.servicio.SetDocumentoResponse")
    @Action(input = "http://ws.jax.org.mx/IServicio/setDocumentoRequest", output = "http://ws.jax.org.mx/IServicio/setDocumentoResponse")
    public void setDocumento(
        @WebParam(name = "arg0", targetNamespace = "")
        Documento arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Sumar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Sumar", targetNamespace = "http://ws.jax.org.mx/", className = "cliente.ws.servicio.Sumar")
    @ResponseWrapper(localName = "SumarResponse", targetNamespace = "http://ws.jax.org.mx/", className = "cliente.ws.servicio.SumarResponse")
    @Action(input = "http://ws.jax.org.mx/IServicio/SumarRequest", output = "http://ws.jax.org.mx/IServicio/SumarResponse")
    public double sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
